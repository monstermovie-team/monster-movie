package edu.nf.movie.cinema.entity;

import lombok.Data;

/**
 * @author kunhhy
 * @date 2020/3/11
 */
@Data
public class CinemaImages {
        private Integer ciId;//图片id
        private String ciPath;//图片路径
        private Integer cinemaId;
}