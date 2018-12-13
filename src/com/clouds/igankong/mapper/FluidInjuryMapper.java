package com.clouds.igankong.mapper;

import com.clouds.igankong.po.FluidInjury;
import com.clouds.igankong.po.FluidInjuryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FluidInjuryMapper {
    int countByExample(FluidInjuryExample example);

    int deleteByExample(FluidInjuryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FluidInjury record);

    int insertSelective(FluidInjury record);

    List<FluidInjury> selectByExample(FluidInjuryExample example);

    FluidInjury selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FluidInjury record, @Param("example") FluidInjuryExample example);

    int updateByExample(@Param("record") FluidInjury record, @Param("example") FluidInjuryExample example);

    int updateByPrimaryKeySelective(FluidInjury record);

    int updateByPrimaryKey(FluidInjury record);
}