package edu.nf.movie.information.dao;

import edu.nf.movie.information.entity.ConsultationComment;
import edu.nf.movie.information.entity.InformationImage;
import edu.nf.movie.information.entity.InformationInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/20
 */
@Repository
public interface InformationDao {

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
     * 加载该资讯的评论
     * @param informationId 资讯id
     * @return
     */
    List<ConsultationComment> listUserComment(Integer informationId);
}
