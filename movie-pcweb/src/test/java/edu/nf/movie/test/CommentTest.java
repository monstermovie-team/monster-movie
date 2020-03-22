package edu.nf.movie.test;

import edu.nf.movie.comment.entity.CommentInfo;
import edu.nf.movie.comment.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/19 15:51
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommentTest {
    @Autowired
    private CommentService service;

    @Test
    public void ListCommentInfo(){
        List<CommentInfo> list=service.ListCommentInfo(2);
        list.forEach(commentInfo-> System.out.println(commentInfo.getMc_scroe()));
    }

    @Test
    public void addCommentInfo(){
        CommentInfo info=new CommentInfo();
        info.setMc_id(7);
        info.setMovie_id(2);
        info.setUser_id(4);
        info.setMc_text("真好看");
        info.setMc_rating(13);
        service.addCommentInfo(info);
    }
}
