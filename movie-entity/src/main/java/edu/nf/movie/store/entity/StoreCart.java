package edu.nf.movie.store.entity;

import lombok.Data;

/**
 * @author yx
 * @date 2020/3/14 18:26
 */
@Data
public class StoreCart {
    private String userName;
    private String productCore;
    private String productName;
    private Integer productNumber;
    private Double productTotalPrice;
}
