package edu.nf.movie.movie.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fu
 * @date 2020/3/4
 */
@RestController
public class MovieController extends BaseController{

    @Autowired
    private MovieService movieService;

    @GetMapping("/movie_list")
    public ResultVO<PageInfo<MovieInfo>> listMovie(Integer pageNum, Integer pageSize){
        PageInfo<MovieInfo> movieInfos = movieService.movieInfoList(pageNum,pageSize);
        return success(movieInfos);
    }

    @GetMapping("/movie_list_by_State")
    public ResultVO<PageInfo<MovieInfo>> listMovieByState(Integer pageNum, Integer pageSize,Integer State){
        PageInfo<MovieInfo> movieInfos = movieService.movieInfoListByState(pageNum,pageSize,State);
        return success(movieInfos);
    }
}
