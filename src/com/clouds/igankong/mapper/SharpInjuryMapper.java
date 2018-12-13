package com.clouds.igankong.mapper;

import com.clouds.igankong.po.SharpInjury;
import com.clouds.igankong.po.SharpInjuryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SharpInjuryMapper {
    int countByExample(SharpInjuryExample example);

    int deleteByExample(SharpInjuryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SharpInjury record);

    int insertSelective(SharpInjury record);

    List<SharpInjury> selectByExample(SharpInjuryExample example);

    SharpInjury selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SharpInjury record, @Param("example") SharpInjuryExample example);

    int updateByExample(@Param("record") SharpInjury record, @Param("example") SharpInjuryExample example);

    int updateByPrimaryKeySelective(SharpInjury record);

    int updateByPrimaryKey(SharpInjury record);
}