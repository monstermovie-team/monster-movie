package edu.nf.movie.customer.pcweb.controller;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.customer.service.CustomerService;
import edu.nf.movie.customer.service.FileUploadService;
import edu.nf.movie.util.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-01
 */
@RestController
public class CustomerController extends BaseController{

    @Autowired
    private CustomerService customerService;

    @Autowired
    private FileUploadService fileUploadService;


    @InitBinder
    public void convertDate(WebDataBinder binder){
        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    @PostMapping("/register")
    public ResultVO register(CustomerInfo customerInfo){
        customerService.addCustomer(customerInfo);
        System.out.println(customerInfo);
        return success("注册成功");
    }

    @PostMapping("/addCustomerUserRole")
    public ResultVO addCustomerUserRole(String customerAccounts){
        customerService.addCustomerUserRole(customerAccounts);
        return success("绑定角色");
    }

    @GetMapping("/getCustomerInfo")
    public ResultVO findCustomerInfo(Authentication auth){
        CustomerInfo customerInfo = (CustomerInfo)auth.getPrincipal();
        return success(customerInfo);
    }

    /**
     * 根据id修改个人信息(不包括头像)
     * @param customerInfo
     * @return
     */
    @PostMapping("/updCustomerInfo")
    public ResultVO updCustomerInfo(Authentication auth,CustomerInfo customerInfo){
        System.out.println(customerInfo.getCustomerName());
        CustomerInfo cu = (CustomerInfo)auth.getPrincipal();
        customerInfo.setCustomerId(cu.getCustomerId());
        customerService.updateCustomerInfo(customerInfo);
        return success("修改成功");
    }

    @PostMapping("/uploadTx")
    public ResultVO uploadTx(HttpServletRequest request,Authentication auth) throws Exception{
        Part part = request.getPart("file");
        InputStream is = part.getInputStream();
        String url = "http://101.37.28.124:8080/monster_movie/customerUser_images";
        UploadUtil.upload(url, is, part.getSubmittedFileName());
        CustomerInfo cu = (CustomerInfo) auth.getPrincipal();
        customerService.updateCustomerPhoto(cu.getCustomerPhoto(),cu.getCustomerId());
        return success("修改成功");
    }
}
