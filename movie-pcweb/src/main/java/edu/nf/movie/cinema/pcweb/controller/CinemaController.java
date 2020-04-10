package edu.nf.movie.cinema.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.cinema.entity.CinemaServiceInfo;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.movie.entity.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */
@RestController
public class CinemaController extends BaseController {

    @Autowired
   private CinemaService cinemaService;

    @GetMapping("/cinema_list")
    public ResultVO<PageInfo<CinemaInfo>> listMovie(Integer pageNum, Integer pageSize){
        PageInfo<CinemaInfo> cinemaInfos = cinemaService.cinemaInfoList(pageNum,pageSize);
        return success(cinemaInfos);
    }
    @GetMapping("/message_list")
    public ResultVO<CinemaInfo> getMessage(Integer mId){
        CinemaInfo cinemaId = cinemaService.getCinemaId(mId);
        return  success(cinemaId);
    }
    @GetMapping("/service_list")
    public ResultVO<List<CinemaServiceInfo>> getServiceList(Integer cinemaId){
        List<CinemaServiceInfo> cinemaServiceList = cinemaService.getCinemaServiceList(cinemaId);
        return success(cinemaServiceList);
    }

}
