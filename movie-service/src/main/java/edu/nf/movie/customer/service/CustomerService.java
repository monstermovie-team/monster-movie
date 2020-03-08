package edu.nf.movie.customer.service;

import edu.nf.movie.customer.entity.CustomerInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

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
}
