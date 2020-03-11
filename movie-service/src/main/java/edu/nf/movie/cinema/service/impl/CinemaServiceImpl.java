package edu.nf.movie.cinema.service.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.dao.CinemaDao;
import edu.nf.movie.cinema.entity.CinemaMessage;
import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.entity.MyService;
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
    public PageInfo<MovieTheatre> getCinemaList(Integer pageNum, Integer pageSize) {
        List<MovieTheatre> cinemaList = cinemaDao.getCinemaList(pageNum, pageSize);
        return new PageInfo<>(cinemaList);
    }

    @Override
    public CinemaMessage getCinemaMessage(Integer Id) {
        CinemaMessage cinemaMessage = cinemaDao.getCinemaMessage(Id);
        return cinemaMessage;
    }

    @Override
    public List<MyService> getServicList(Integer[] id) {
        List<MyService> servicList = cinemaDao.getServicList(id);
        return servicList;
    }
}