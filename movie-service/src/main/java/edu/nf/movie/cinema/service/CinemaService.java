package edu.nf.movie.cinema.service;

import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.order.entity.OrderForm;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
public interface CinemaService {
   // PageInfo<MovieTheatre> getCinemaList(Integer pageNum, Integer pageSize);

    MovieTheatre getCinemaMessage(Integer Id);

    List<CinemaService> getServicList(Integer csId);


}