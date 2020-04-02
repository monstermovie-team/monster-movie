package edu.nf.movie.order.service;


import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.order.entity.OrderTicket;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
public interface OrderService {

    List<OrderTicket> getOrderList( Integer uId);

    OrderTicket getOrder(Integer tId);

    CinemaInfo getNameCinema(String cinemaName);
}