package edu.nf.movie.information.pcweb.contorller;

import edu.nf.movie.customer.pcweb.vo.ResultVO;
import edu.nf.movie.information.entity.ConsultationComment;
import edu.nf.movie.information.entity.InformationImage;
import edu.nf.movie.information.entity.InformationInfo;
import edu.nf.movie.information.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/20
 */
@RestController
public class InformationController extends BaseController{

    @Autowired
    private InformationService service;

    @GetMapping("/listNowInformation")
    public ResultVO<List<InformationInfo>> listNowInformation(){
        List<InformationInfo> list=service.listNowInformation();
        return success(list);
    }

    @GetMapping("/listHotInformation")
    public ResultVO<List<InformationInfo>> listHotInformation(){
        List<InformationInfo> list=service.listHotInformation();
        return success(list);
    }

    @GetMapping("/informationContent")
    public ResultVO<InformationInfo> findInformation(Integer informationId){
        InformationInfo info=service.informationContent(informationId);
        return success(info);
    }

    @GetMapping("/listInformationImage")
    public ResultVO<List<InformationImage>> listInformationImage(Integer informationId){
        List<InformationImage> list=service.listInformationImage(informationId);
        return success(list);
    }


    @GetMapping("/listUserComments")
    public ResultVO<List<ConsultationComment>> listUserComment(Integer informationId){
        List<ConsultationComment> list=service.listUserComment(informationId);
        return success(list);
    }
}
