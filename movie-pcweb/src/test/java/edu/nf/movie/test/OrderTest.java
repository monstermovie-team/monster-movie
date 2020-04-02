package edu.nf.movie.test;

import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.order.entity.OrderForm;
import edu.nf.movie.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testListMovie() {
        OrderForm order = orderService.getOrder(4);
        System.out.println(order.getCinemaName());
    }


}
