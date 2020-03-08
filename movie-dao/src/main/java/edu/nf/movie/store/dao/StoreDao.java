package edu.nf.movie.store.dao;

import edu.nf.movie.store.entity.StoreInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/5 12:55
 */
public interface StoreDao {
    /**
     * 遍历商城首页商品
     * @return
     */
    List<StoreInfo>listStoreInfo(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}
