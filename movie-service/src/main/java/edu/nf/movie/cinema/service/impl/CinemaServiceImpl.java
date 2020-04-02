package edu.nf.movie.cinema.service.impl;

import edu.nf.movie.cinema.dao.CinemaDao;
import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.order.entity.OrderForm;
import edu.nf.movie.cinema.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
@Service("CinemaService")
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaDao cinemaDao;

    @Override
    public MovieTheatre getCinemaMessage(Integer Id) {
        return null;
    }

    @Override
    public List<CinemaService> getServicList(Integer csId) {
        return null;
    }

//    @Override
//    public PageInfo<MovieTheatre> getCinemaList(Integer pageNum, Integer pageSize) {
//        List<MovieTheatre> cinemaList = cinemaDao.getCinemaList(pageNum, pageSize);
//        return new PageInfo<>(cinemaList);
//    }

//    @Override
//    public MovieTheatre getCinemaMessage(Integer Id) {
//        MovieTheatre cinemaMessage = cinemaDao.getCinemaMessage(Id);
//        return cinemaMessage;
//    }
//
//    @Override
//    public List<MyService> getServicList(Integer csId) {
//        List<MyService> servicList = cinemaDao.getServiceList(csId);
//        return servicList;
//    }


}