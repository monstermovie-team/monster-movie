package edu.nf.movie.information.entity;

import edu.nf.movie.customer.entity.CustomerInfo;
import lombok.Data;

/**
 * @author 我们狠可爱
 * @date 2020/3/18
 * 资讯评论表
 */
@Data
public class ConsultationComment {
    /**
     * 资讯评论ID
     */
    private Integer ccId;
    /**
     * 资讯ID
     */
    private Integer informationId;
    /**
     * 评论用户ID
     */
    private Integer userId;
    /**
     * 评论内容
     */
    private String ccText;
    /**
     * 评论图片
     */
    private String ccImage;
    /**
     * 评论等级
     */
    private String ccRating;
    /**
     * 评论时间
     */
    private String ccDate;

    /**
     * 一对一管理用户
     */
    private CustomerInfo customerInfo;
}
