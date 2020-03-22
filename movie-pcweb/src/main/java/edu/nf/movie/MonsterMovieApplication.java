package edu.nf.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author BoomShaGa1aGa
 * @date 2020-03-02
 */
@SpringBootApplication
@MapperScan(basePackages = {"edu.nf.movie.customer.dao",
                            "edu.nf.movie.movie.dao",
                            "edu.nf.movie.actor.dao",
                            "edu.nf.movie.store.dao",
                            "edu.nf.movie.cinema.dao","edu.nf.movie.comment.dao"})
public class MonsterMovieApplication {


    public static void main(String[] args) {
        SpringApplication.run(MonsterMovieApplication.class);
    }

}
