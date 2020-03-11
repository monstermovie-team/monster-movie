package edu.nf.movie.cinema.service;

import com.github.pagehelper.PageInfo;

import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.entity.MyService;
import edu.nf.movie.cinema.entity.OrderForm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
public interface CinemaService {
   // PageInfo<MovieTheatre> getCinemaList(Integer pageNum, Integer pageSize);

    MovieTheatre getCinemaMessage(Integer Id);

    List<MyService> getServicList(Integer csId);

    List<OrderForm> getOrderList(Integer uId);
}