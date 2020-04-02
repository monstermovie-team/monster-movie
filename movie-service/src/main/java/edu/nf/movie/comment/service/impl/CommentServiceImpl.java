package edu.nf.movie.comment.service.impl;

import edu.nf.movie.comment.dao.CommentDao;
import edu.nf.movie.comment.entity.CommentInfo;
import edu.nf.movie.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/19 15:35
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao dao;

    @Override
    public List<CommentInfo> ListCommentInfo(Integer mid) {
        List<CommentInfo>list=dao.ListCommentInfo(mid);
        return list;
    }

    @Override
    public void addCommentInfo(CommentInfo info) {
        dao.addCommentInfo(info);
    }
}
