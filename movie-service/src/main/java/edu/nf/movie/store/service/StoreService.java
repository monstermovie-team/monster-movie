package edu.nf.movie.store.service;

import edu.nf.movie.store.entity.StoreInfo;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/5 14:05
 */
public interface StoreService {

    List<StoreInfo> listStoreInfo(Integer pageNum, Integer pageSize);
}
