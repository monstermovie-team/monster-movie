package edu.nf.movie.information.service.impl;

import edu.nf.movie.exception.DataException;
import edu.nf.movie.information.dao.InformationDao;
import edu.nf.movie.information.entity.ConsultationComment;
import edu.nf.movie.information.entity.InformationImage;
import edu.nf.movie.information.entity.InformationInfo;
import edu.nf.movie.information.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 我们狠可爱
 * @date 2020/3/20
 */
@Service("informationService")
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationDao informationDao;

    @Override
    public List<InformationInfo> listNowInformation() {
        try{
            List<InformationInfo> list=informationDao.listNowInformation();
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问最新资讯");
        }
    }

    @Override
    public List<InformationInfo> listHotInformation() {
        try{
            List<InformationInfo> list=informationDao.listHotInformation();
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问最热资讯");
        }
    }

    @Override
    public InformationInfo informationContent(Integer informationId) {
        try{
            return informationDao.informationContent(informationId);
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问资讯页面");
        }
    }

    @Override
    public List<InformationImage> listInformationImage(Integer informationId) {
        try{
            List<InformationImage> list=informationDao.listInformationImage(informationId);
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问资讯图集");
        }
    }

    @Override
    public List<ConsultationComment> listUserComment(Integer informationId) {
        try{
            List<ConsultationComment> list=informationDao.listUserComment(informationId);
            return list;
        }catch (Exception e){
            throw new DataException("服务器内部错误,暂时无法访问资讯评论");
        }
    }
}
