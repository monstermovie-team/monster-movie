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
    private String gmDate; //购买时间
    private Integer orderNo; //订单编号
    private String cinemaName; //影院名称
    private String bfTimetable; //播放时间
    private String cinemaHall; //厅级
    private String upSeat; //座位
    private Integer toNum; //数量
    private BigDecimal toPrice; //总价
    private String movieName; //电影名称
    private String miPath; //图片路径
}