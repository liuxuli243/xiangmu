package com.liuxuli.service.impl.system;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuxuli.dao.api.system.SysUserMapper;
import com.liuxuli.model.system.SysUser;
import com.liuxuli.service.api.system.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{

	@Resource
	private SysUserMapper sysUserMapper;
	
	public int deleteByPrimaryKey(Long userid) {
		return sysUserMapper.deleteByPrimaryKey(userid);
	}

	public int insert(SysUser record) {
		return sysUserMapper.insert(record);
	}

	public int insertSelective(SysUser record) {
		return sysUserMapper.insertSelective(record);
	}

	public SysUser selectByPrimaryKey(Long userid) {
		return sysUserMapper.selectByPrimaryKey(userid);
	}

	public int updateByPrimaryKeySelective(SysUser record) {
		return sysUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysUser record) {
		return sysUserMapper.updateByPrimaryKey(record);
	}

	public List<SysUser> getUserList(Map<String, Object> map) {
		return sysUserMapper.getUserList(map);
	}

	public int getUserCount(Map<String, Object> map) {
		return sysUserMapper.getUserCount(map);
	}

	
}
