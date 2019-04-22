/*
* RechargeTypeMapper.java
* Copyright(C) 2019-2020 GZ-ZGG公司
* @date 2019-04-22 17:50:14
*/
package com.zgg.manager.dao;

import com.zgg.manager.entity.RechargeType;
import com.zgg.manager.entity.RechargeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeTypeMapper {
    /**
     *  根据指定的条件获取数据库记录数
     *
     * @param example 
 	 * @return long
     */
    long countByExample(RechargeTypeExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录
     *
     * @param example 
 	 * @return int
     */
    int deleteByExample(RechargeTypeExample example);

    /**
     *  根据主键删除数据库的记录
     *
     * @param id 
 	 * @return int
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录
     *
     * @param record 
 	 * @return int
     */
    int insert(RechargeType record);

    /**
     *  动态字段,写入数据库记录
     *
     * @param record 
 	 * @return int
     */
    int insertSelective(RechargeType record);

    /**
     *  根据指定的条件查询符合条件的数据库记录
     *
     * @param example 
 	 * @return java.util.List<com.zgg.manager.entity.RechargeType>
     */
    List<RechargeType> selectByExample(RechargeTypeExample example);

    /**
     *  根据指定主键获取一条数据库记录
     *
     * @param id 
 	 * @return com.zgg.manager.entity.RechargeType
     */
    RechargeType selectByPrimaryKey(Long id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录
     *
     * @param record
     * @param example 
 	 * @return int
     */
    int updateByExampleSelective(@Param("record") RechargeType record, @Param("example") RechargeTypeExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录
     *
     * @param record
     * @param example 
 	 * @return int
     */
    int updateByExample(@Param("record") RechargeType record, @Param("example") RechargeTypeExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录
     *
     * @param record 
 	 * @return int
     */
    int updateByPrimaryKeySelective(RechargeType record);

    /**
     *  根据主键来更新符合条件的数据库记录
     *
     * @param record 
 	 * @return int
     */
    int updateByPrimaryKey(RechargeType record);
}