package edu.nf.movie.store.pcweb.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.store.entity.StoreInfo;
import edu.nf.movie.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author yx
 * @date 2020/3/8 15:55
 */
@RestController
public class StoreController extends BaseController {

    @Autowired
    private StoreService service;

    @GetMapping("/store_list")
    public ResultVO<PageInfo<StoreInfo>> listStore(Integer pageNum, Integer pageSize){
        try {
            PageInfo<StoreInfo> store=service.listStoreInfo(pageNum, pageSize);
            return success(store);
        } catch (Exception e) {
            return orr(e.getMessage());
        }
    }

    @GetMapping("/store_listByName/{name}")
    public ResultVO<PageInfo<StoreInfo>> listStoreByName(@PathVariable String name, Integer pageNum, Integer pageSize){
        try {
            PageInfo<StoreInfo> store=service.listStoreInfoByName(pageNum, pageSize,name);
            return success(store);
        } catch (Exception e) {
            return orr(e.getMessage());
        }
    }

    @GetMapping("/linkStoreInfoById/{StoreCore}")
    public ResultVO linkStoreInfoById(HttpSession session, @PathVariable String StoreCore){
        session.setAttribute("store",StoreCore);
        return success(200,"store_info.html");
    }

    @GetMapping("/findStoreInfo")
    public ResultVO loginInfo(HttpSession session){
        String info=null;
        try {
            info = (String) session.getAttribute("store");
        } catch (Exception e) {
            e.printStackTrace();
            return orr(e.getMessage());
        }
        return success(200,info);
    }

    @GetMapping("/storeInfoById/{sId}")
    public ResultVO<List<StoreInfo>> listStoreByName(@PathVariable String sId){
        try {
           List<StoreInfo>  store=service.listStoreInfoById(sId);
            return success(store);
        } catch (Exception e) {
            return orr(e.getMessage());
        }
    }
}
