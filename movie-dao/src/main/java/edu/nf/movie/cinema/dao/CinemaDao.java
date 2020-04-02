package edu.nf.movie.cinema.dao;



import edu.nf.movie.cinema.entity.MovieTheatre;
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
     * 查出所有电影院列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    //List<MovieTheatre> getCinemaList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);


    /**
     * 根据电影id查出电影院信息
//     */
//    MovieTheatre getCinemaMessage(@Param("mId") Integer mId);
//
//    /**
//     *根据id查服务
//     * @param
//     * @return
//     */
//    List<MyService> getServiceList(@Param("csId")Integer csId);



}