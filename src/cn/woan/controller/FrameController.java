/**
 * 系统项目名称：开发者平台
 * cn.woan.developerPlatform.controller.admin
 * FrameController.java
 * 
 * 2014年9月30日-上午9:59:50
 *  2014北京沃安科技公司-版权所有
 * 
 */
package cn.woan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * FrameController
 * 
 * yihong.tan@woaner.cn
 * 2014年9月30日 上午9:59:50
 * 
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/layout")
public class FrameController {
	@RequestMapping("/top")
	public String top() {
		return "/admin/top";
	}
	@RequestMapping("/left")
	public String left() {
		return "/admin/left";
	}
	@RequestMapping("/mainframe")
	public String mainframe() {
		return "/admin/mainframe";
	}

}
