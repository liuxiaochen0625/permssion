package cn.woan.service;

import cn.woan.pageModel.Bug;
import cn.woan.pageModel.DataGrid;

public interface BugServiceI {

	public DataGrid datagrid(Bug bug);

	public Bug save(Bug bug);

	public void remove(String ids);

	public Bug getBug(String id);

	public Bug edit(Bug bug);

}
