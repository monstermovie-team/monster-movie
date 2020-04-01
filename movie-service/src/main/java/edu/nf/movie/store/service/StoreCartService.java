package edu.nf.movie.store.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.store.entity.StoreCart;


/**
 * @author yx
 * @date 2020/3/9 16:49
 */
public interface StoreCartService {

    void addStoreCart(StoreCart storeCartInfo);

    PageInfo<StoreCart> listStoreCartInfo(Integer pageNum, Integer pageSize);
}
