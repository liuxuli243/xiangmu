package com.liuxuli.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liuxuli.model.system.SysUser;
import com.liuxuli.service.api.system.SysUserService;
import com.liuxuli.util.PageUtil;

@Controller
public class SysUserController {

	@Resource
	private SysUserService sysUserService;
	
	@RequestMapping(value = "toUserListPage")
	public ModelAndView toUserListPage(HttpServletRequest request){
		//获取第几页
		String index = request.getParameter("index") == null ? "1" : request.getParameter("index");
		//每页十条
		int size = 10;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("size", size);
		map.put("start", PageUtil.getStart(Integer.valueOf(index), size));
		List<SysUser> userlist = sysUserService.getUserList(map);
		int count = sysUserService.getUserCount(map);
		int pagecount = count % size == 0 ? count /size : count /size +1;
		request.setAttribute("userlist", userlist);
		//总页数
		request.setAttribute("pagecount", pagecount);
		//第几页
		request.setAttribute("index", index);
		//一共多少条
		request.setAttribute("count", count);
		return new ModelAndView("/userlist");
	}
}
