package com.clouds.igankong.mapper;

import com.clouds.igankong.po.HandHealth;
import com.clouds.igankong.po.HandHealthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandHealthMapper {
    int countByExample(HandHealthExample example);

    int deleteByExample(HandHealthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HandHealth record);

    int insertSelective(HandHealth record);

    List<HandHealth> selectByExample(HandHealthExample example);

    HandHealth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HandHealth record, @Param("example") HandHealthExample example);

    int updateByExample(@Param("record") HandHealth record, @Param("example") HandHealthExample example);

    int updateByPrimaryKeySelective(HandHealth record);

    int updateByPrimaryKey(HandHealth record);
}