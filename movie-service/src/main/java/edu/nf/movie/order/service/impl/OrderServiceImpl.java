package edu.nf.movie.order.service.impl;


import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.order.dao.OrderDao;
import edu.nf.movie.order.entity.OrderForm;
import edu.nf.movie.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao OrderDao;

    @Override
    public List<OrderForm> getOrderList(Integer uId) {
        List<OrderForm> orderList = OrderDao.getOrderList(uId);
        return orderList;
    }

    @Override
    public OrderForm getOrder(Integer tId) {
        OrderForm order = OrderDao.getOrder(tId);
        return order;
    }

    @Override
    public CinemaInfo getNameCinema(String cinemaName) {
        CinemaInfo nameCinema = OrderDao.getNameCinema(cinemaName);
        return nameCinema;
    }
}