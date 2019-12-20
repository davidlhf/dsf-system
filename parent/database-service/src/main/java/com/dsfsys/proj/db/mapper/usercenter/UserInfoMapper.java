package com.dsfsys.proj.db.mapper.usercenter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dsfsys.proj.db.entity.usercenter.UserInfo;
import com.dsfsys.proj.db.entity.usercenter.UserInfoExample;
import com.dsfsys.proj.db.entity.usercenter.UserInfoKey;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(UserInfoKey key);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(UserInfoKey key);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}