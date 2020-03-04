
import com.github.pagehelper.PageInfo;
import edu.nf.movie.customer.entity.MovieInfo;
import edu.nf.movie.movie.service.MovieService;
import edu.nf.movie.movie.service.impl.MovieServiceImpl;

import org.junit.Test;

/**
 * @author Fu
 * @date 2020/3/4
 */
public class MovieTest {

    @Test
    public void testListMovie() {
        MovieService movieService = new MovieServiceImpl();
        PageInfo<MovieInfo> pageInfo = movieService.movieInfoList(1, 5);
        pageInfo.getList().forEach(movieInfo -> System.out.println(movieInfo.getMovieName()));
    }

}
