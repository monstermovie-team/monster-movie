package edu.nf.movie.cinema.entity;

import lombok.Data;
/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Data
public class MovieTheatre {

    private  Integer  Id ;	//影院编号
    private String mtName;   //影院名称
    private String imgPath; //图片路径
    private String cinemaAddress; //影院地址
    private String mtNumber;//影院电话
}