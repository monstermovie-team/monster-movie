package edu.nf.movie.test;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.service.MovieService;
import org.junit.Test;
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
public class MovieTest {

    @Autowired
    private MovieService movieService;

    @Test
    public void testListMovie() {
        //MovieService movieService = new MovieServiceImpl();
        PageInfo<MovieInfo> pageInfo = movieService.movieInfoList(1, 5);
        pageInfo.getList().forEach(movieInfo -> System.out.println(movieInfo.getMovieName()));
    }

}
