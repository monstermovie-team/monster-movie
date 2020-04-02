package edu.nf.movie.test;

import edu.nf.movie.cinema.service.CinemaService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Fu
 * @date 2020/3/4
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CinemaTest {

    @Autowired
    private CinemaService cinemaService;

}
