package edu.nf.movie.order.pcweb.controller;

import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.order.entity.OrderTicket;
import edu.nf.movie.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */
@RestController
public class OrderController extends BaseController {

    @Autowired
   private OrderService orderService;

    @GetMapping("/order_list")
    public ResultVO<List<OrderTicket>> getOrderList(Integer uId){
        List<OrderTicket> orderList = orderService.getOrderList(uId);
        return success(orderList);
    }
    @GetMapping("/order_form")
    public ResultVO<OrderTicket> getOrder(Integer orId){
        OrderTicket order = orderService.getOrder(orId);
        return success(order);
    }

    @GetMapping("/cinema_message")
    public  ResultVO<CinemaInfo> getNameCinema(String cinemaName){
        CinemaInfo nameCinema = orderService.getNameCinema(cinemaName);
        return success(nameCinema);
    }

}
