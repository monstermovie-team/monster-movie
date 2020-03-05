package edu.nf.movie.cinema.entity;

import lombok.Data;
/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Data
public class MovieTheatre {
    private  Integer  mtId ;	//影院编号
    private String mtName;   //影院名称
    private Integer areaId; //影院地址
    private String mtBrand;//影院品牌
    private Integer mhId;  //影厅厅级
    private String csId; //影院服务
    private String mtNumber;  //联系电话
    private Integer mtUse;//使用状态
}