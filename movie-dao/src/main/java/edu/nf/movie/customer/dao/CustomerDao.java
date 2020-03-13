package edu.nf.movie.customer.dao;

import edu.nf.movie.customer.entity.CustomerInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author BoomShaGa1aGa
 * @date 2020-02-29
 * 用户
 */
@Repository
public interface CustomerDao {

    /**
     * @param accounts 账号
     * @return
     * 根据账号查询用户（关联查询）
     */
    CustomerInfo findCustomerByAccounts(String accounts);

    /**
     * 注册账号
     * @param customerInfo
     */
    void addCustomer(CustomerInfo customerInfo);

    /**
     * 添加关联表信息
     */
    void addCustomerUserRole(Integer customerId,Integer roleId);

    /**
     * 根据账号查询用户id
     * @param accounts
     * @return
     */
    CustomerInfo findCustomerIdByAccounts(String accounts);

    /**
     * 修改用户信息(不修改头像)
     * @param customerInfo
     */
    void updateCustomerInfo(CustomerInfo customerInfo);

    /**
     * 修改用户头像
     * @param customerInfo
     */
    void updateCustomerPhoto(CustomerInfo customerInfo);
}
