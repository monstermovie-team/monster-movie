package edu.nf.movie.movie.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.MovieInfo;


/**
 * @author Fu
 * @date 2020/3/4
 */
public interface MovieService {
    PageInfo<MovieInfo> movieInfoList(Integer pageNum, Integer pageSize);
}
