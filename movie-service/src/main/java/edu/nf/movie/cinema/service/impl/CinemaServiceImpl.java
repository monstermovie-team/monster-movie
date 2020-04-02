package edu.nf.movie.cinema.service.impl;


import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.dao.CinemaDao;
import edu.nf.movie.cinema.entity.AreaInfo;
import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.cinema.entity.CinemaServiceInfo;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.movie.dao.MovieDao;
import edu.nf.movie.movie.entity.MovieInfo;
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
    public PageInfo<CinemaInfo> cinemaInfoList(Integer pageNum, Integer pageSize) {
        List<CinemaInfo> cinemaInfos = cinemaDao.cinemaInfoList(pageNum,pageSize);
        return new PageInfo<>(cinemaInfos);
    }

    @Override
    public List<AreaInfo> AreaInfoList() {
        return null;
    }

    @Override
    public List<CinemaServiceInfo> CinemaServiceList() {
        return null;
    }
}