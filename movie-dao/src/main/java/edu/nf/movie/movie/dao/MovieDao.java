package edu.nf.movie.movie.dao;

import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.entity.MovieRegion;
import edu.nf.movie.movie.entity.MovieType;
import edu.nf.movie.movie.entity.MovieYear;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */
@Repository
public interface MovieDao {
    List<MovieInfo> movieInfoList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    List<MovieInfo> movieInfoListByState(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize ,Integer State);

    List<MovieType> movieTypeList();

    List<MovieYear> movieYearList();

    List<MovieRegion> movieRegionList();


    /**
     * 电影介绍
     * @param movieId
     * @return
     * 芊富
     */
    MovieInfo findMovie(Integer movieId);

    /**
     * 加载电影海报
     *芊富
     */
    String moviePoster(Integer movieId);

    /**
     * 加载电影图集
     * 芊富
     */
    List<String> listMoviePoster(Integer movieId);

    /**
     * 加载该电影的演职人员
     * 芊富
     * @// TODO: 2020/3/6
     */

}
