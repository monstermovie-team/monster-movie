package edu.nf.movie.cinema.entity;

import lombok.Data;
/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Data
public class MovieTheatre {
    private  Integer  mtId ;	//影院编号
    private String mtName;   //影院名称
    private String areaCounty; //影院行政区
    private String areaAddress; //影院地址
    private String mtNumber;//影院电话
}