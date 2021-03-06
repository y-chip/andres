package com.yamamoto.yuta.andres.infrastructure.repository.mapper;

import com.yamamoto.yuta.andres.infrastructure.repository.entity.Master;
import com.yamamoto.yuta.andres.infrastructure.repository.entity.MasterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MasterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    long countByExample(MasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int deleteByExample(MasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int insert(Master record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int insertSelective(Master record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    List<Master> selectByExample(MasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    Master selectByPrimaryKey(Integer code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Master record, @Param("example") MasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Master record, @Param("example") MasterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Master record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MASTER
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Master record);
}