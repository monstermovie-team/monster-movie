package edu.nf.movie.cinema.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fu
 * @date 2020/3/4
 */
@RestController
public class CinemaController extends BaseController {

    @Autowired
   private CinemaService cinemaService;

    @GetMapping("/cinema_list")
    public ResultVO<PageInfo<MovieTheatre>> getCinemaList(Integer pageNum, Integer pageSize){
        PageInfo<MovieTheatre> cinemaList = cinemaService.getCinemaList(pageNum, pageSize);
        return success(cinemaList);
    }


}
