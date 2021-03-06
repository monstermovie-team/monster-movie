package edu.nf.movie.movie.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.*;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/movie_type")
    public ResultVO listMovieType(){
        List<MovieType> movieType = movieService.movieTypeList();
        return success(movieType);
    }
    @GetMapping("/movie_region")
    public ResultVO listMovieRegion(){
        List<MovieRegion> movieRegion = movieService.movieRegionList();
        return success(movieRegion);
    }
    @GetMapping("/movie_year")
    public ResultVO listMovieYear(){
        List<MovieYear> movieYear = movieService.movieYearList();
        return success(movieYear);
    }

    @GetMapping("/movie_poster")
    public ResultVO moviePoster(Integer movieId){
        String moviePoster = movieService.moviePoster(movieId);
        return success(moviePoster);
    }

    @GetMapping("/movie_find")
    public ResultVO findmovie(Integer movieId){
        MovieInfo movieInfo=movieService.findMovie(movieId);
        return success(movieInfo);
    }

    @GetMapping("/findListMovieActor")
    public ResultVO<List<MovieInfo>> getFindMovie(Integer actorId){
        List<MovieInfo> list=movieService.listMovieActor(actorId);
        return success(list);
    }

    @GetMapping("/movie_list_list")
    public ResultVO<List<MovieInfo>> listMovieList(){
        List<MovieInfo> list = movieService.listMovieList();
        return success(list);
    }

    @GetMapping("/movie_list_expect")
    public ResultVO<List<MovieInfo>> listMovieListByExpect(){
        List<MovieInfo> list = movieService.listMovieListByExpect();
        return success(list);
    }

    @GetMapping("/movie_list_top100")
    public ResultVO<PageInfo<MovieInfo>> listMovietop100(Integer pageNum, Integer pageSize){
        PageInfo<MovieInfo> movieInfos = movieService.listMovieListTop100(pageNum,pageSize);
        return success(movieInfos);
    }
}
