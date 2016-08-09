package com.liuxuli.dao.api.system;

import java.util.List;
import java.util.Map;

import com.liuxuli.model.system.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> getUserList(Map<String, Object> map);

	int getUserCount(Map<String, Object> map);
}