package edu.nf.movie.customer.service.impl;

import edu.nf.movie.customer.dao.CustomerDao;
import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.entity.CustomerRole;
import edu.nf.movie.customer.service.CustomerService;
import edu.nf.movie.customer.service.exception.UserNotFoundException;
import edu.nf.movie.util.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-01
 */
@Service("customerService")
@Transactional(rollbackFor = RuntimeException.class)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void addCustomer(CustomerInfo customerInfo) {
        //设置用户状态
        customerInfo.setCustomerState(true);
        //密码加密
        PasswordUtils.encodePassword(customerInfo.getPassword());
        customerDao.addCustomer(customerInfo);
    }

    @Override
    public void addCustomerUserRole(String customerAccounts) {
        //根据账户查询id
        CustomerInfo customerInfo = customerDao.findCustomerByAccounts(customerAccounts);
        customerDao.addCustomerUserRole(customerInfo.getCustomerId(),1);
    }

    @Override
    public UserDetails loadUserByUsername(String accounts) throws UsernameNotFoundException {
        CustomerInfo customerInfo = customerDao.findCustomerByAccounts(accounts);
        if(customerInfo == null){
            throw new UserNotFoundException("用户不存在");
        }
        //将用户的角色信息封装为GrantedAuthority
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (CustomerRole role : customerInfo.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getCustomerRoleName()));
        }
        customerInfo.setAuthorities(authorities);
        return customerInfo;
    }
}
