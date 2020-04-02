package edu.nf.movie.test;

import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.order.entity.OrderTicket;
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
//        OrderForm order = orderService.getOrder(4);
//        System.out.println(order.getCinemaName());
        List<OrderTicket> orderList = orderService.getOrderList(1);
        orderList.forEach(orderTicket -> System.out.println(orderTicket.getMovieImage().getMovieImagePath()));
        OrderTicket order = orderService.getOrder(4);
        System.out.println(order.getPrice());
        CinemaInfo cinema = orderService.getNameCinema("朵森电影院");

        System.out.println(cinema.getCinemaAddress());
    }


}
