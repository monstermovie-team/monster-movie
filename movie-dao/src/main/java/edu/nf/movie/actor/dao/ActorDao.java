package edu.nf.movie.actor.dao;

import edu.nf.movie.actor.entity.ActorInfo;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/6
 */

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
}
