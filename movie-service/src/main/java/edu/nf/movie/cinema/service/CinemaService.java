package edu.nf.movie.cinema.service;


import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.entity.AreaInfo;
import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.cinema.entity.CinemaServiceInfo;

import java.util.List;

/**
 * @author kunhhy
 * @date 2020/3/8
 */
public interface CinemaService {
    PageInfo<CinemaInfo> cinemaInfoList(Integer pageNum, Integer pageSize);

    List<AreaInfo> AreaInfoList();

    List<CinemaServiceInfo> CinemaServiceList();
}