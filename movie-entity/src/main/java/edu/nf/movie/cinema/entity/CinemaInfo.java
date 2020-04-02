package edu.nf.movie.cinema.entity;

import lombok.Data;

/**
 * @author Fu
 * @date 2020/4/2
 */
@Data
public class CinemaInfo {
    private Integer cinemaId;
    private String cinemaName;
    private String cinemaAddress;
    private String cinemaNumber;
    private String cinemaReferencePrice;
}
