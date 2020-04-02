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


    /**
     *根据电影id查出电影信息
     * @param mId
     * @return
     */
    CinemaInfo getCinemaId(@Param("mId") Integer mId);
   // List<AreaInfo> AreaInfoList();

    /**
     * 根据id查服务
     * @param cinemaId
     * @return
     */
    List<CinemaServiceInfo> getCinemaServiceList(@Param("cinemaId") Integer cinemaId);
}