package edu.nf.movie.test;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.cinema.entity.CinemaInfo;
import edu.nf.movie.cinema.entity.CinemaServiceInfo;
import edu.nf.movie.cinema.service.CinemaService;
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
        PageInfo<CinemaInfo> cinemaInfoPageInfo = cinemaService.cinemaInfoList(1,5);
        cinemaInfoPageInfo.getList().forEach(cinemaInfo -> System.out.println(cinemaInfo.getCinemaId()));
        CinemaInfo cinemaId = cinemaService.getCinemaId(1);
        System.out.println(cinemaId.getCinemaName());
        List<CinemaServiceInfo> cinemaServiceList = cinemaService.getCinemaServiceList(1);
        cinemaServiceList.forEach(cinemaServiceInfo -> System.out.println(cinemaServiceInfo.getCsName()));
    }

}
