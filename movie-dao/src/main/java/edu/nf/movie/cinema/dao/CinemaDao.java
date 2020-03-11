package edu.nf.movie.cinema.dao;

import edu.nf.movie.cinema.entity.CinemaMessage;
import edu.nf.movie.cinema.entity.MyService;
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
    List<MovieTheatre> getCinemaList(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);


    /**
     * 根据电影id查出电影信息
     */
    CinemaMessage getCinemaMessage(Integer mId);

    /**
     *
     * @param
     * @return
     */
    List<MyService> getServicList(Integer[] csId);
}