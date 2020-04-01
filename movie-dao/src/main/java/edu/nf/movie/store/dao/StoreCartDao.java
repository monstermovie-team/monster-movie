package edu.nf.movie.store.dao;

import edu.nf.movie.store.entity.StoreCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/19 14:53
 */
public interface StoreCartDao {
    void addStoreCart(StoreCart storeCartInfo);

    List<StoreCart> listStoreCartInfo(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
