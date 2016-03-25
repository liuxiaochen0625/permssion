package cn.woan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.woan.pageModel.DataGrid;
import cn.woan.pageModel.Online;
import cn.woan.service.OnlineServiceI;

@RequestMapping("/onlineController")
@Controller
public class OnlineController {

	private OnlineServiceI onlineService;

	public OnlineServiceI getOnlineService() {
		return onlineService;
	}

	@Autowired
	public void setOnlineService(OnlineServiceI onlineService) {
		this.onlineService = onlineService;
	}

	@RequestMapping("/datagrid")
	@ResponseBody
	public DataGrid datagrid(Online online) {
		return onlineService.datagrid(online);
	}

}
