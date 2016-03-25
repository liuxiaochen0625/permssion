package cn.woan.service;

import cn.woan.pageModel.DataGrid;
import cn.woan.pageModel.Role;

public interface RoleServiceI {

	public DataGrid datagrid(Role role);

	public Role save(Role role);

	public void remove(String ids);

	public Role edit(Role role);

}
