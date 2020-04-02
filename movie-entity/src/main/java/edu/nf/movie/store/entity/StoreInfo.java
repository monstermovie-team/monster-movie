package edu.nf.movie.store.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yx
 * @date 2020/3/5 13:41
 */
@Data
public class StoreInfo {
    /**
     * 主键
     */
    private Integer productId;
    /**
     * 商品编码
     */
    private String productCore;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 分类名称
     */
    private String categoryName;
    /**
     * 价格
     */
    private BigDecimal price;
    /**\
     * 重量
     */
    private Double weight;
    /**
     * 高度
     */
    private Double height;
    /**
     * 宽度
     */
    private Double width;
    /**
     * 生产日期
     */
    private String production_date;
    /**
     * 有效时间
     */
    private Integer shelf_life;
    /**
     * 商品描述
     */
    private String storeInfo;

    private String imgAddress;
}
