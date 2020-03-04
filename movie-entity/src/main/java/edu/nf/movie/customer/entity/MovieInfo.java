package edu.nf.movie.customer.entity;

import lombok.Data;

/**
 * @author Fu
 * @date 2020/3/4
 */
@Data
public class MovieInfo {
    private Integer movieId;//电影编号
    private String movieName;//电影名称
    private String movieEnglishName;//电影英文名
    private Integer movieWantToSee;//电影想看数
    private String movieType;//电影类型
    private String movieRegion;//电影区域
    private String movieYear;//电影年代
    private Integer movieState;//电影状态
    private Integer movieTime;//电影时长
    private String movieIntroduce;//电影介绍
    private String movieImage;//电影图片

}
