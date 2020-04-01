package edu.nf.movie.customer.service;

import edu.nf.movie.customer.entity.CustomerInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author BoomShaGa1aGa
 * @date 2020-02-29
 */
public interface CustomerService extends UserDetailsService {

    /**
     * 用户注册
     * @param customerInfo
     */
    void addCustomer(CustomerInfo customerInfo);

    /**
     * 添加关联表信息
     */
    void addCustomerUserRole(String customerAccounts);

    /**
     * 修改用户信息
     * @param customerInfo
     */
    void updateCustomerInfo(CustomerInfo customerInfo);

    /**
     * 修改用户头像
     * @param customerPhoto
     */
    void updateCustomerPhoto(String customerPhoto,Integer customerId);


}
