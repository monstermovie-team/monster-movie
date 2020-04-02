package edu.nf.movie.comment.service;

import edu.nf.movie.comment.entity.CommentInfo;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/19 15:34
 */
public interface CommentService {
    /**
     * 查询点赞数最高的前10条评论
     * @param mid 电影Id
     * @return
     */
    List<CommentInfo>ListCommentInfo(Integer mid);

    /**
     * 添加评论
     * @param info 评论信息
     */
    void addCommentInfo(CommentInfo info);
}
