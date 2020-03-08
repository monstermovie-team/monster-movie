package edu.nf.movie.test;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.customer.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        customerInfo.setCustomerPassword("123123");
        customerInfo.setCustomerState(true);
        customerService.addCustomer(customerInfo);
    }
}
