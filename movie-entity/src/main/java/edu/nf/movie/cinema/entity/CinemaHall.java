package edu.nf.movie.cinema.entity;

import lombok.Data;

import java.text.DecimalFormat;

/**
 * @author Fu
 * @date 2020/4/2
 */
@Data
public class CinemaHall {
    private Integer hallId;
    private Integer cinema_id;
    private String hall_name;
    private String hall_type;
    private Integer hall_row;
    private Integer hall_col;
    private Double hall_price;
    private Integer state_id;
}
