package edu.nf.movie.test;

import com.github.pagehelper.PageInfo;

import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.entity.OrderForm;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.entity.MovieType;
import edu.nf.movie.movie.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CinemaTest {

    @Autowired
    private CinemaService cinemaService;

    @Test
    public void testListMovie() {
//        PageInfo<MovieTheatre> pageInfo = cinemaService.getCinemaList(1, 5);
//        pageInfo.getList().forEach(cinema -> System.out.println(cinema.getMtName()));

//       MovieTheatre cinemaMessage = cinemaService.getCinemaMessage(1);
//       System.out.println(  cinemaMessage.getMtName());
        List<OrderForm> orderList = cinemaService.getOrderList(1);
        orderList.forEach(orderForm -> System.out.println(orderForm.getTStudiosName()));
    }


}
