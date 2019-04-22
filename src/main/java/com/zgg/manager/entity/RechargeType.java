/*
* RechargeType.java
* Copyright(C) 2019-2020 GZ-ZGG公司
* @date 2019-04-22 17:50:14
*/
/**
* 数据库表：t_recharge_type
* @author lu shun zhi
* @date 2019-04-22 17:50:14
* @description 充值类型表-lu shun zhi
*/
package com.zgg.manager.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class RechargeType implements Serializable {
    /**
     * id主键
     */
    private Long id;

    /**
     * 充值类型名称
     */
    private String name;

    /**
     * 积分和类型值兑换比例(比例0.8,用户积分100,可换成80元抵扣)
     */
    private BigDecimal percent;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String note;

    /**
     * t_recharge_type
     */
    private static final long serialVersionUID = 1L;

    /**
     * id主键
     * @return id id主键
     */
    public Long getId() {
        return id;
    }

    /**
     * id主键
     * @param id id主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 充值类型名称
     * @return name 充值类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 充值类型名称
     * @param name 充值类型名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 积分和类型值兑换比例(比例0.8,用户积分100,可换成80元抵扣)
     * @return percent 积分和类型值兑换比例(比例0.8,用户积分100,可换成80元抵扣)
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * 积分和类型值兑换比例(比例0.8,用户积分100,可换成80元抵扣)
     * @param percent 积分和类型值兑换比例(比例0.8,用户积分100,可换成80元抵扣)
     */
    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
     * 创建人
     * @return creator 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 创建人
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人
     * @return modifier 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 修改人
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 备注
     * @return note 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", percent=").append(percent);
        sb.append(", creator=").append(creator);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}