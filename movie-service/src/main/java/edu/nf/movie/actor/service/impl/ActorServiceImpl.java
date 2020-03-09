package edu.nf.movie.actor.service.impl;

import edu.nf.movie.actor.dao.ActorDao;
import edu.nf.movie.actor.entity.ActorInfo;
import edu.nf.movie.actor.service.ActorService;
import edu.nf.movie.exception.DataException;
import edu.nf.movie.movie.entity.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/8
 */
@Service("actorService")
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;


    @Override
    public ActorInfo findActor(Integer actorId) {
        try{
            ActorInfo actorInfo=actorDao.findActor(actorId);
            return actorInfo;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问");
        }
    }

    @Override
    public String actorPoster(Integer actorId) {
        try{
            return actorDao.actorPoster(actorId);
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问海报");
        }
    }

    @Override
    public List<String> actorListPoster(Integer actorId) {
        try{
            List<String> list=actorDao.actorListPoster(actorId);
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问图集");
        }
    }

    @Override
    public List<ActorInfo> listActorJoinMovie(Integer movieId) {
        try{
            List<ActorInfo> list=actorDao.listActorJoinMovie(movieId);
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问演员");
        }


    }
}
