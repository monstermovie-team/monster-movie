package edu.nf.movie.cinema.entity;

import lombok.Data;

/**
 * @author kunhhy
 * @date 2020/3/9
 */
@Data
public class CinemaMessage {
    private  Integer  mtId ;	//影院编号
    private String mtName;   //影院名称
    private String areaId; //影院地址
    private String number; //电话
    private String csId; //服务
}