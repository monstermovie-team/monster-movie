package edu.nf.movie.actor.entity;

import lombok.Data;

/**
 * @author 我们狠可爱
 * @date 2020/3/5
 * 演员表
 */
@Data
public class ActorInfo {
    /**
     *演员编号
     */
    private int actorId;
    /**
     * 演员姓名
     */
    private String actorName;
    /**
     * 演员英文名
     */
    private String actorEnglishName;
    /**
     * 演员身份
     */
    private String actorIdentity;
    /**
     * 演员生日
     */
    private String actorBirthday;
    /**
     * 演员性别
     */
    private String actorSex;
    /**
     * 演员介绍
     */
    private String actorIntroduce;
    /**
     * 演员出生地
     */
    private String actorBirthplace;
    /**
     * 演员国籍
     */
    private String actorNationality;
    /**
     * 演员演员毕业于
     */
    private String actorGraduation;
    /**
     * 演员姓名
     */
    private String actorPrize;

}
