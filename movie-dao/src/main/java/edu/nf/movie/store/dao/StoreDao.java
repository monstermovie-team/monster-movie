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
     * 分页查询商品
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<StoreInfo>listStoreInfo(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    /**
     * 根据分类查询商品
     * @param pageNum
     * @param pageSize
     * @param cname
     * @return
     */
    List<StoreInfo>listStoreInfoByName(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize, String cname);

    /**
     * 商品详细
     * @param sId
     * @return
     */
    List<StoreInfo> listStoreInfoById(String sId);
}
