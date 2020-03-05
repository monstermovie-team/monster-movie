package edu.nf.movie.cinema.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Repository
public interface CinemaDao {
    /**
     * 根据县区级地区查出所有电影列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<MovieTheatre> getCinemaList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize,String areaCounty);
}