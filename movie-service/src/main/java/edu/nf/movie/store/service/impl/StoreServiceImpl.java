package edu.nf.movie.store.service.impl;

import com.github.pagehelper.PageInfo;
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
    private StoreDao dao;

    @Override
    public PageInfo<StoreInfo> listStoreInfo(Integer pageNum, Integer pageSize) {
        List<StoreInfo> storeInfo= dao.listStoreInfo(pageNum,pageSize);
        return new PageInfo<>(storeInfo);
    }

    @Override
    public PageInfo<StoreInfo> listStoreInfoByName(Integer pageNum, Integer pageSize, String cname) {
        List<StoreInfo> storeInfo= dao.listStoreInfoByName(pageNum,pageSize,cname);
        return new PageInfo<>(storeInfo);
    }

    @Override
    public List<StoreInfo> listStoreInfoById(String sId) {
        List<StoreInfo> list=dao.listStoreInfoById(sId);
        return list;
    }

}
