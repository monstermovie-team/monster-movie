package edu.nf.movie.information.entity;

import lombok.Data;

/**
 * @author 我们狠可爱
 * @date 2020/3/18
 * 资讯图片
 */
@Data
public class InformationImage {
    /**
     * 资讯图片ID
     */
    private Integer informationImageId ;
    /**
     * 资讯ID
     */
    private Integer informationId;
    /**
     * 资讯图片路径
     */
    private String informationPath;
    /**
     * 资讯图片类型，1海报2图集
     */
    private Integer informationImageType;
}
