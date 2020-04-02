package edu.nf.movie.order.service;


import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.order.entity.OrderForm;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
public interface OrderService {


    List<OrderForm> getOrderList(Integer uId);

    OrderForm getOrder(Integer tId);

    CinemaInfo getNameCinema(String cinemaName);
}