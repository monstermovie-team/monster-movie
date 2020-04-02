package edu.nf.movie.comment.entity;

import edu.nf.movie.customer.entity.CustomerInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import lombok.Data;

/**
 * @author yx
 * @date 2020/3/19 14:47
 */
@Data
public class CommentInfo {
    private Integer mc_id;
    private Integer movie_id;
    private Integer user_id;
    private String mc_text;
    private Integer mc_rating;
    private String mc_date;
    private Double mc_scroe;
    private CustomerInfo customerInfo;
//    private CommentJoinCustomer commentJoinCustomer;
}
