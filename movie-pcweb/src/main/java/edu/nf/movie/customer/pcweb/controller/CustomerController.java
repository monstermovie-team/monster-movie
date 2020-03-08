package edu.nf.movie.customer.pcweb.controller;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-01
 */
@RestController
public class CustomerController extends BaseController{

    @Autowired
    private CustomerService customerService;

    @GetMapping("/register")
    public ResultVO register(CustomerInfo customerInfo){
        customerService.addCustomer(customerInfo);
        return success("注册成功");
    }

    @PostMapping("/addCustomerUserRole")
    public ResultVO addCustomerUserRole(String customerAccounts){
        customerService.addCustomerUserRole(customerAccounts);
        return success("绑定角色");
    }
}
