package edu.nf.movie.store.service.impl;

import edu.nf.movie.store.dao.StoreDao;
import edu.nf.movie.store.entity.StoreInfo;
import edu.nf.movie.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/5 14:42
 */
@Service("StoreService")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreDao storeDao;

    @Override
    public List<StoreInfo> listStoreInfo(Integer pageNum, Integer pageSize) {
        return storeDao.listStoreInfo(pageNum,pageSize);
    }
}
