package edu.nf.movie.cinema.pcweb.controller;

import com.github.pagehelper.PageInfo;

import edu.nf.movie.cinema.entity.MovieTheatre;
import edu.nf.movie.cinema.entity.MyService;
import edu.nf.movie.cinema.entity.OrderForm;
import edu.nf.movie.cinema.service.CinemaService;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Fu
 * @date 2020/3/4
 */
@RestController
public class CinemaController<arrs> extends BaseController {

    @Autowired
   private CinemaService cinemaService;

//    @GetMapping("/cinema_list")
//    public ResultVO<PageInfo<MovieTheatre>> getCinemaList(Integer pageNum, Integer pageSize){
//        PageInfo<MovieTheatre> cinemaList = cinemaService.getCinemaList(pageNum, pageSize);
//        return success(cinemaList);
//    }
    @GetMapping("/message_list")
    public ResultVO<MovieTheatre> getMessage(Integer mId){
        MovieTheatre cinemaMessage = cinemaService.getCinemaMessage(mId);
        return success(cinemaMessage);
    }
    @GetMapping("/service_list")
    public ResultVO<List<MyService>> getServiceList(Integer csId){
        List<MyService> servicList = cinemaService.getServicList(csId);
        return success(servicList);
    }
    @GetMapping("/order_list")
    public ResultVO<List<OrderForm>> getOrderList(Integer uId){
        List<OrderForm> orderList = cinemaService.getOrderList(uId);
        return success(orderList);
    }


}
