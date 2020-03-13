package edu.nf.movie.actor.service;

import edu.nf.movie.actor.entity.ActorInfo;
import edu.nf.movie.movie.entity.MovieInfo;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/8
 * 芊富
 */

public interface ActorService {

    ActorInfo findActor(Integer actorId);
    String actorPoster(Integer actorId);
    List<String> actorListPoster(Integer actorId);

    /**
     * 加载该电影的演职人员
     * 芊富
     */
    List<ActorInfo> listActorJoinMovie(Integer movieId);
}
