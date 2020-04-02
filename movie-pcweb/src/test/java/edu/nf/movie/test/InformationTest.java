package edu.nf.movie.test;

import edu.nf.movie.information.entity.ConsultationComment;
import edu.nf.movie.information.entity.InformationImage;
import edu.nf.movie.information.entity.InformationInfo;
import edu.nf.movie.information.service.InformationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InformationTest {

    @Autowired
    private InformationService service;

    @Test
    public void testListNowInformation(){
        List<InformationInfo> list=service.listNowInformation();
        for (InformationInfo i : list) {
            System.out.println(i.getInformationId());
            System.out.println(i.getInformationTitle());
            System.out.println(i.getInformationText());
        }
    }

    @Test
    public void testListHotInformation(){
        List<InformationInfo> list=service.listHotInformation();
        for (InformationInfo i : list) {
            System.out.println(i.getInformationId());
            System.out.println(i.getInformationTitle());
            System.out.println(i.getInformationText());
        }
    }


    @Test
    public void testInformation(){
        InformationInfo info=service.informationContent(1);
        System.out.println(info.getInformationId());
        System.out.println(info.getInformationTitle());
        System.out.println(info.getInformationText());
    }

    @Test
    public void testListInformationImage(){
        List<InformationImage> list=service.listInformationImage(1);
        for (InformationImage i : list) {
            System.out.println(i.getInformationPath());
        }
    }


    @Test
    public void testListComment(){
        List<ConsultationComment> list=service.listUserComment(1);
        for (ConsultationComment c : list) {
            System.out.println(c.getCustomerInfo().getCustomerId());
            System.out.println(c.getCustomerInfo().getCustomerName());
            System.out.println(c.getCustomerInfo().getCustomerPhoto());
            System.out.println(c.getCcText());
            System.out.println(c.getCcDate());
        }
    }

}
