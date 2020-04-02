package edu.nf.movie.cinema.dao;


import edu.nf.movie.cinema.entity.AreaInfo;
import edu.nf.movie.cinema.entity.CinemaInfo;

import edu.nf.movie.cinema.entity.CinemaServiceInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Repository
public interface CinemaDao {
    List<CinemaInfo> cinemaInfoList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    List<AreaInfo> AreaInfoList();

    List<CinemaServiceInfo> CinemaServiceList();
}