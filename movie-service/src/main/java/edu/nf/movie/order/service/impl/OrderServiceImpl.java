package edu.nf.movie.order.service.impl;


import edu.nf.movie.cinema.entity.CinemaInfo;

import edu.nf.movie.order.dao.OrderDao;
import edu.nf.movie.order.entity.OrderTicket;
import edu.nf.movie.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public List<OrderTicket> getOrderList(Integer uId) {
        List<OrderTicket> orderList = orderDao.getOrderList(uId);
        return orderList;
    }

    @Override
    public OrderTicket getOrder(Integer tId) {
        OrderTicket order = orderDao.getOrder(tId);
        return order;
    }

    @Override
    public CinemaInfo getNameCinema(String cinemaName) {
        CinemaInfo nameCinema = orderDao.getNameCinema(cinemaName);
        return nameCinema;
    }
}