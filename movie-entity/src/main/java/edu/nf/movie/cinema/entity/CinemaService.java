package edu.nf.movie.cinema.entity;

import lombok.Data;
/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Data
public class CinemaService {
    private Integer csId;//服务编号
    private String csName;//服务名称
    private String csDescribe;//详情信息
   private Integer cinemaId;
}