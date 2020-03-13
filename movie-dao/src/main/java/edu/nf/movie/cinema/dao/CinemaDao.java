package edu.nf.movie.cinema.dao;


import edu.nf.movie.cinema.entity.MyService;
import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.entity.OrderForm;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Repository
public interface CinemaDao {
    /**
     * 查出所有电影院列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    //List<MovieTheatre> getCinemaList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);


    /**
     * 根据电影id查出电影信息
     */
    MovieTheatre getCinemaMessage(@Param("mId") Integer mId);

    /**
     *根据id查服务
     * @param
     * @return
     */
    List<MyService> getServiceList(@Param("csId")Integer csId);

    /**
     *根据用户Id查订单
     * @param uId
     * @return
     */
    List<OrderForm> getOrderList(@Param("uId") Integer uId);

    /**
     *根据订单Id查订单详情
     * @param tId
     * @return
     */
    OrderForm getOrder(@Param("tId")Integer tId);

    /**
     * 根据影院名称查影院信息
     * @param cinemaName
     * @return
     */
    MovieTheatre getNameCinema(@Param("cinemaName") String cinemaName);

}