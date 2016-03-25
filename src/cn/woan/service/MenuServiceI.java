package cn.woan.service;

import java.util.List;

import cn.woan.pageModel.Menu;

public interface MenuServiceI {

	public List<Menu> allTreeNode();

	public List<Menu> treegrid();

	public void remove(String id);

	public Menu add(Menu menu);

	public Menu edit(Menu menu);

}
