/**
 * 项目名：系统项目名称
 * 包名：cn.woan.controller
 * 文件名：QRController.java
 * 版本信息：
 * 日期：2014年10月3日-上午7:16:47
 * Copyright (c) 2014祝网公司-版权所有
 * 
 */

package cn.woan.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.woan.util.QRCodeUtil;

/**
 * 类名称：QRController
 * 类描述：
 * 创建人：tyh-admin
 * 修改人：tyh-admin
 * 修改时间：2014年10月3日 上午7:16:47
 * 修改备注：
 * @version 1.0.0
 * http://repo1.maven.org/maven2/com/google/zxing/
 */
@Controller
@RequestMapping("/qr")
public class QRController {
	@RequestMapping(value = { "", "/index" })
	public String play() {
		return "/app/qr";
	}
	
	@RequestMapping("/gernatecode")
	public void login(@RequestParam(required = false) String quval,Model model, 
			HttpServletResponse response, HttpServletRequest request) {
		
		request.getSession().setAttribute("quval", quval);
		if(quval==null || quval.equals("")){
			quval="关注沃安科技，谢谢！";
		}
		ServletOutputStream output;
		try {
			output = response.getOutputStream();
			QRCodeUtil.encode(quval, output);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("conent", quval);
	}

}

