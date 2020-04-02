package edu.nf.movie.information.service;

import edu.nf.movie.information.entity.ConsultationComment;
import edu.nf.movie.information.entity.InformationImage;
import edu.nf.movie.information.entity.InformationInfo;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/20
 */

public interface InformationService {

    /**
     * 最新执行小标题
     * @return
     */
    List<InformationInfo> listNowInformation();

    /**
     * 最热资讯标题
     * @return
     */
    List<InformationInfo> listHotInformation();

    /**
     * 加载资讯页面
     * @param informationId 资讯ID
     * @return
     */
    InformationInfo informationContent(Integer informationId);

    /**
     * 加载资讯图集
     * @param informationId 资讯ID
     * @return
     */
    List<InformationImage> listInformationImage(Integer informationId);

    /**
     * 加载资讯评论
     * @param informationId
     * @return
     */
    List<ConsultationComment> listUserComment(Integer informationId);
}
