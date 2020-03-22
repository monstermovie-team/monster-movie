package edu.nf.movie.store.service;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.store.entity.StoreInfo;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/5 14:05
 */
public interface StoreService {

    PageInfo<StoreInfo> listStoreInfo(Integer pageNum, Integer pageSize);

    PageInfo<StoreInfo> listStoreInfoByName(Integer pageNum, Integer pageSize,String cname);

    List<StoreInfo> listStoreInfoById(String sId);
}
