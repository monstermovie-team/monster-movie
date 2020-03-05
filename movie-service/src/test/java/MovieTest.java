
import com.github.pagehelper.PageInfo;
import edu.nf.movie.movie.entity.MovieInfo;
import edu.nf.movie.movie.service.MovieService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Fu
 * @date 2020/3/4
 */
public class MovieTest {

    @Autowired
    private MovieService service;

    @Test
    public void testListMovie() {
        PageInfo<MovieInfo> pageInfo = service.movieInfoList(1, 5);
        pageInfo.getList().forEach(movieInfo -> System.out.println(movieInfo.getMovieName()));
    }

}
