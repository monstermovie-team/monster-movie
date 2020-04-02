package edu.nf.movie.cinema.entity;


import lombok.Data;
/**
 * @author kunhhy
 * @date 2020/3/5
 */
@Data
public class AreaInfo {
    private Integer areaId;//地区编号
    private String areaProvince;//省级
    private String  areaCity;	//市级
    private String areaCounty;	//县区级

}