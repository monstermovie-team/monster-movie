package edu.nf.movie.customer.pcweb.controller;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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

    @InitBinder
    public void convertDate(WebDataBinder binder){
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }

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

    @GetMapping("/getCustomerInfo")
    public ResultVO finfCustomerInfo(Authentication auth){
        CustomerInfo customerInfo = (CustomerInfo)auth.getPrincipal();
        return success(customerService.findCustomerInfo(customerInfo.getCustomerAccounts()));
    }

    @PostMapping("/updCustomerInfo")
    public ResultVO updCustomerInfo(CustomerInfo customerInfo,Authentication auth){
        CustomerInfo cus = (CustomerInfo)auth.getPrincipal();
        customerInfo.setCustomerId(cus.getCustomerId());
        customerService.updateCustomerInfo(customerInfo);
        return success("修改成功");
    }
}
