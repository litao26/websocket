package com.xuetao.websocket.controller;

import java.util.Map;

import com.xuetao.websocket.webstocket.SessionPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author chenpeng
 * @email 363642626@qq.com
 */
@Controller
public class MonitorController {

	@GetMapping("/show")
	public String show()
	{
		return "/show.html";
	}

	@ResponseBody
	@GetMapping("/sendMessage")
	public static String sendMessage(@RequestParam Map<String, Object> params)
	{
		String msg = params.get("msg").toString();
		SessionPool.sendMessage(params);
		return "发送成功";
	}
}
