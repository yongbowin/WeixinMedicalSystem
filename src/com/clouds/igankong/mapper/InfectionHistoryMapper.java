package com.clouds.igankong.mapper;

import com.clouds.igankong.po.InfectionHistory;
import com.clouds.igankong.po.InfectionHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfectionHistoryMapper {
    int countByExample(InfectionHistoryExample example);

    int deleteByExample(InfectionHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InfectionHistory record);

    int insertSelective(InfectionHistory record);

    List<InfectionHistory> selectByExample(InfectionHistoryExample example);

    InfectionHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InfectionHistory record, @Param("example") InfectionHistoryExample example);

    int updateByExample(@Param("record") InfectionHistory record, @Param("example") InfectionHistoryExample example);

    int updateByPrimaryKeySelective(InfectionHistory record);

    int updateByPrimaryKey(InfectionHistory record);
}