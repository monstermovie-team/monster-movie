package edu.nf.movie.cinema.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author kunhhy
 * @date 2020/3/11
 */
@Data
public class OrderForm {

    private Integer tId; //订单Id
    private Date tDate; //购买时间
    private Integer orderNo; //订单编号
    private String tStudiosName; //影院名称
    private Date tTimetable; //播放时间
    private String tCinemaHall; //厅级
    private String tSeat; //座位
    private Integer tNum; //数量
    private BigDecimal tPrice; //总价
    private String movieName; //电影名称
    private String miPath; //图片路径
}