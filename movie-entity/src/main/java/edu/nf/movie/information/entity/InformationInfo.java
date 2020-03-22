package edu.nf.movie.information.entity;

import lombok.Data;

/**
 * @author 我们狠可爱
 * @date 2020/3/18
 * 资讯信息表
 */
@Data
public class InformationInfo {

    /**
     * 资讯ID
     */
    private Integer informationId;
    /**
     * 资讯标题
     */
    private String informationTitle;
    /**
     * 资讯内容
     */
    private String informationText;
    /**
     * 资讯发布时间
     */
    private String informationTime;
    /**
     * 资讯观看人数
     */
    private Integer informationLooknum;

    /**
     * 一对一图片海报
     */
    private InformationImage informationImage;
}
