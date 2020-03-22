package edu.nf.movie.store.service.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.store.dao.StoreCartDao;
import edu.nf.movie.store.entity.StoreCart;

import edu.nf.movie.store.service.StoreCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/9 16:49
 */
@Service
public class StoreCartServiceImpl implements StoreCartService {

    @Autowired
    private StoreCartDao dao;

    @Override
    public void addStoreCart(StoreCart storeCartInfo) {
        try {
            dao.addStoreCart(storeCartInfo);
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
    @Override
    public PageInfo<StoreCart> listStoreCartInfo(Integer pageNum, Integer pageSize) {
        List<StoreCart> storeCartInfos= dao.listStoreCartInfo(pageNum,pageSize);
        return new PageInfo<>(storeCartInfos);
    }
}
