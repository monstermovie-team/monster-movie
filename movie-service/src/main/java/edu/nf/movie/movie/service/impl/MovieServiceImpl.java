package edu.nf.movie.movie.service.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.customer.entity.MovieInfo;
import edu.nf.movie.movie.dao.MovieDao;
import edu.nf.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */
@Service("movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public PageInfo<MovieInfo> movieInfoList(Integer pageNum, Integer pageSize) {
        List<MovieInfo> movieInfos = movieDao.movieInfoList(pageNum,pageSize);
        return new PageInfo<>(movieInfos);
    }
}
