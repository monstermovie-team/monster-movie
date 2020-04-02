package edu.nf.movie.cinema.entity;

import lombok.Data;

/**
 * @author kunhhy
 * @date 2020/4/2
 */
@Data
public class CinemaInfo {
    private  Integer  cinemaId ;	//影院编号
    private String cinemaName;   //影院名称
    private String cinemaAddress; //影院地址
    private String cinemaNumber; //影院号码
}