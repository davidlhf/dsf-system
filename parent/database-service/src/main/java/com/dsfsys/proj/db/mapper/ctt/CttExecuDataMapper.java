package com.dsfsys.proj.db.mapper.ctt;

import com.dsfsys.proj.db.entity.ctt.CttExecuData;
import com.dsfsys.proj.db.entity.ctt.CttExecuDataExample;
import com.dsfsys.proj.db.entity.ctt.CttExecuDataKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CttExecuDataMapper {
    long countByExample(CttExecuDataExample example);

    int deleteByExample(CttExecuDataExample example);

    int deleteByPrimaryKey(CttExecuDataKey key);

    int insert(CttExecuData record);

    int insertSelective(CttExecuData record);

    List<CttExecuData> selectByExample(CttExecuDataExample example);

    CttExecuData selectByPrimaryKey(CttExecuDataKey key);

    int updateByExampleSelective(@Param("record") CttExecuData record, @Param("example") CttExecuDataExample example);

    int updateByExample(@Param("record") CttExecuData record, @Param("example") CttExecuDataExample example);

    int updateByPrimaryKeySelective(CttExecuData record);

    int updateByPrimaryKey(CttExecuData record);
}