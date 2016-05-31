package com.sea.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@ResponseBody
	@RequestMapping("new")
	public Map<String, Object> test(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "字母");
		map.put("b", "数字");
		map.put("c", "我去");
		map.put("d", "打野");
		return map;
	}
}
