package edu.nf.movie.order.dao;

import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.order.entity.OrderTicket;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/4/2
 */
@Repository
public interface OrderDao {
    /**
     *根据用户Id查订单
     * @param uId
     * @return
     */
    List<OrderTicket> getOrderList(@Param("uId") Integer uId);



    /**
     *根据订单Id查订单详情
     * @param tId
     * @return
     */
    OrderTicket getOrder(@Param("tId")Integer tId);

    /**
     * 根据影院名称查影院信息
     * @param cinemaName
     * @return
     */
    CinemaInfo getNameCinema(@Param("cinemaName") String cinemaName);
}