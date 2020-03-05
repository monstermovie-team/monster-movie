package edu.nf.movie.movie.dao;

import edu.nf.movie.movie.entity.MovieInfo;
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
}
