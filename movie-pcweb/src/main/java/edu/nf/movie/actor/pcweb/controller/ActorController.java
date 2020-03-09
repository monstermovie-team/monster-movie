package edu.nf.movie.actor.pcweb.controller;

import com.sun.org.apache.regexp.internal.RE;
import edu.nf.movie.actor.entity.ActorInfo;
import edu.nf.movie.actor.service.ActorService;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.movie.entity.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/9
 */
@RestController
public class ActorController extends BaseController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/find_movieJoinActor")
    public ResultVO<List<ActorInfo>> getMovieJoinActor(Integer movieId){
        List<ActorInfo> list=actorService.listActorJoinMovie(movieId);
        return success(list);
    }


    @GetMapping("/findActor")
    public ResultVO<ActorInfo> getFindActor(Integer movieId){
        ActorInfo actorInfo=actorService.findActor(movieId);
        return success(actorInfo);
    }

    @GetMapping("/actor_image")
    public ResultVO getActorImage(Integer movieId){
        String path=actorService.actorPoster(movieId);
        return success(path);
    }

    @GetMapping("/listActorImage")
    public ResultVO<List<String>> getListActorImage(Integer movieId){
        List<String> list=actorService.actorListPoster(movieId);
        return success(list);
    }


}
