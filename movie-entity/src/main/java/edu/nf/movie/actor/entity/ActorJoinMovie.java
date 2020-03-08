package edu.nf.movie.actor.entity;

import edu.nf.movie.movie.entity.MovieInfo;
import lombok.Data;

import java.util.List;


/**
 * @author 我们狠可爱
 * @date 2020/3/6
 *参演电影表
 * 芊富
 */
@Data
public class ActorJoinMovie {
    /**
     * 演员编号
     */
    private int actorId;
    /**
     * 电影编号
     */
    private int movieId;

    /**
     * 关联电影
     */
    private List<MovieInfo> monitorInfo;

    /**
     * 关联演员
     */
    private List<ActorInfo> actorInfo;
}
