package edu.nf.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author BoomShaGa1aGa
 * @date 2020-03-02
 */
@SpringBootApplication
<<<<<<< HEAD
@MapperScan("edu.nf.movie.customer.dao")
public class  MonsterMovieApplication {
=======
@MapperScan(basePackages = {"edu.nf.movie.customer.dao","edu.nf.movie.movie.dao"})
public class MonsterMovieApplication {
>>>>>>> origin/master

    public static void main(String[] args) {
        SpringApplication.run(MonsterMovieApplication.class);
    }

}
