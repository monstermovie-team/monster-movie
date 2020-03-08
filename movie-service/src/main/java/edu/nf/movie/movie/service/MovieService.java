package edu.nf.movie.movie.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.entity.MovieRegion;
import edu.nf.movie.movie.entity.MovieType;
import edu.nf.movie.movie.entity.MovieYear;

import java.util.List;


/**
 * @author Fu
 * @date 2020/3/4
 */
public interface MovieService {
    PageInfo<MovieInfo> movieInfoList(Integer pageNum, Integer pageSize);

    PageInfo<MovieInfo> movieInfoListByState( Integer pageNum,Integer pageSize,Integer State);

    List<MovieType> movieTypeList();

    List<MovieYear> movieYearList();

    List<MovieRegion> movieRegionList();
}
