package edu.nf.movie.store.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.store.entity.StoreCart;
import edu.nf.movie.store.service.StoreCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yx
 * @date 2020/3/9 17:01
 */
@RestController
public class StoreCartController extends BaseController {

    @Autowired
    private StoreCartService storeCartService;

    @PostMapping("/addStoreInfo")
    public ResultVO<Object> addCustomerInfo(StoreCart info){
        storeCartService.addStoreCart(info);
        return success(200,"添加成功");
    }

    @GetMapping("/storeCart_list")
    public ResultVO<PageInfo<StoreCart>> listStore(Integer pageNum, Integer pageSize){
        try {
            PageInfo<StoreCart> store=storeCartService.listStoreCartInfo(pageNum, pageSize);
            return success(store);
        } catch (Exception e) {
            return orr(e.getMessage());
        }
    }
}
