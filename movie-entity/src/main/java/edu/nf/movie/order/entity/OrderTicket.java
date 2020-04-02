package edu.nf.movie.order.entity;

import edu.nf.movie.cinema.entity.CinemaImages;
import edu.nf.movie.movie.entity.MovieImage;
import edu.nf.movie.movie.entity.MovieInfo;
import lombok.Data;

/**
 * @author kunhhy
 * @date 2020/4/2
 */
@Data
public class OrderTicket {
    private Integer tId;
    private  Integer orderNo;
    private  String studiosName;
    private  String timetable;
    private  String cinemaHall;
    private String seat;
    private  Integer num;
    private  Double price;
    private  String qrcode;
    private String conductor;
    private String state;
    private  String date;
    private String userId;
    private Integer movieId;
    private MovieInfo movieInfo;
    private MovieImage movieImage;

 }