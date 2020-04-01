package edu.nf.movie.test;

import com.github.pagehelper.PageInfo;
import edu.nf.movie.store.entity.StoreInfo;
import edu.nf.movie.store.service.StoreService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/15 14:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StoreTest {
    @Autowired
    private StoreService service;

    @Test
    public void testListStoreInfo() {
        PageInfo<StoreInfo> list = service.listStoreInfo(1, 5);
        list.getList().forEach(storeInfo -> System.out.println(storeInfo.getImgAddress()));
    }

    @Test
    public void testListStoreInfoByName() {
        String name = "手办";
        PageInfo<StoreInfo> list = service.listStoreInfoByName(1, 5, name);
        list.getList().forEach(storeInfo -> System.out.println(storeInfo.getProductName()));
    }

    @Test
    public void testListStoreInfoById() {
        List<StoreInfo> list = service.listStoreInfoById("10150901001");
        list.forEach(storeInfo -> System.out.println(storeInfo.getProductName()));
    }
}
