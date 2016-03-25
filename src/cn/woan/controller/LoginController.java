/**
 * 系统项目名称：开发者平台
 * cn.woan.developerPlatform.controller.admin
 * LoginController.java
 * 
 * 2014年9月29日-下午3:50:34
 *  2014北京沃安科技公司-版权所有
 * 
 */
package cn.woan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * LoginController
 * 
 * yihong.tan@woaner.cn 2014年9月29日 下午3:50:34
 * 
 * @version 1.0.0
 * 
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

	@RequestMapping(value = { "", "/index" })
	public String index() {
		return "/admin/login";
	}

	@RequestMapping("/login")
	public String login(@RequestParam(required = false) String username,	@RequestParam(required = false) String password,
			@RequestParam(required = false) String verifycode,Model model, HttpServletRequest request) {
		
		request.getSession().setAttribute("username", username);
		System.out.println(username+"========================username");
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		return "/admin/homepage";
	}

}
