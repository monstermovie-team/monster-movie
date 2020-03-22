package edu.nf.movie.comment.pcweb.controller;

import edu.nf.movie.comment.entity.CommentInfo;
import edu.nf.movie.comment.service.CommentService;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/19 16:17
 */
@RestController
public class CommentController extends BaseController{

    @Autowired
    private CommentService service;

    @GetMapping("/listCommentInfo/{movie_id}")
    public ResultVO<List<CommentInfo>> listCommentInfo(@PathVariable Integer movie_id){
        List<CommentInfo>list= service.ListCommentInfo(movie_id);
        return success(list);
    }

    @PostMapping("/addCommentInfo")
    public ResultVO<Object> addCommentInfo(CommentInfo info){
        service.addCommentInfo(info);
        return success("评论成功");
    }
}
