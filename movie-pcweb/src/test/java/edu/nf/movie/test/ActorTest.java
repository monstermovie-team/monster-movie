package edu.nf.movie.test;

import edu.nf.movie.actor.entity.ActorInfo;
import edu.nf.movie.actor.service.ActorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ActorTest {

    @Autowired
    private ActorService actorService;

    @Test
    public void findActor(){
        ActorInfo actorInfo=actorService.findActor(1);
        System.out.println(actorInfo.getActorName());
    }

    @Test
    public void findActorImage(){
        String s=actorService.actorPoster(1);
        System.out.println(s);
    }

    @Test
    public void listActorImage(){
        List<String> list=actorService.actorListPoster(1);
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void listActorJoinMovie(){
        List<ActorInfo> list=actorService.listActorJoinMovie(1);
        for (ActorInfo a : list) {
            System.out.println(a.getActorName());
            System.out.println(a.getActorImages().getActorImagePath());
        }

    }
}
