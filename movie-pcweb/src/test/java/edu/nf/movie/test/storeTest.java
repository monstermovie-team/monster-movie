package edu.nf.movie.test;

import edu.nf.movie.store.entity.StoreInfo;
import edu.nf.movie.store.service.StoreService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author yx
 * @date 2020/3/5 20:28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class storeTest {
    @Autowired
    private StoreService service;
    @Test
    public void testListStoreInfo() {

        List<StoreInfo> list = service.listStoreInfo(1, 5);
        for (StoreInfo storeInfo : list) {
            System.out.println(storeInfo.getProductName());
        }
    }
}
