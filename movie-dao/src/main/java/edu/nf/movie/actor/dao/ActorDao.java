package edu.nf.movie.actor.dao;

import edu.nf.movie.actor.entity.ActorInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/6
 */
@Repository
public interface ActorDao {
    /**
     * 通过演员ID来看演员信息
     * @param actorId
     * @return
     */
    ActorInfo findActor(Integer actorId);

    /**
     * 加载演员海报
     * 芊富
     */
    String actorPoster(Integer actorId);

    /**
     * 加载演员图集
     * @param actorId
     * @return
     */
    List<String> actorListPoster(Integer actorId);

    /**
     * 加载该电影的演职人员
     * 芊富
     * @// TODO: 2020/3/6
     */
    List<ActorInfo> listActorJoinMovie(Integer movieId);
}
