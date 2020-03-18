package edu.nf.movie.test;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.service.CustomerService;
import edu.nf.movie.util.UploadUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CustomerTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void testRegister(){
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setCustomerName("蛇皮鸡");
        customerInfo.setCustomerAccounts("xnmddm");
        customerInfo.setCustomerPassword("123");
        customerInfo.setCustomerState(true);
        customerService.addCustomer(customerInfo);
    }

//    @Test
//    public void testUpoad() throws Exception{
//        try {
//            String url = "http://101.37.28.124:8080/monster_movie/customerUser_images";
//            UploadUtil.upload(url,is,"123");
//        }catch(RuntimeException e) {
//            throw new RuntimeException("上传失败");
//        }
//    }
}
