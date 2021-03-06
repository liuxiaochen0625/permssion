package cn.woan.service;

import java.util.List;

import cn.woan.pageModel.DataGrid;
import cn.woan.pageModel.User;

public interface UserServiceI {

	public User save(User user);

	public User find(User user);

	public DataGrid datagrid(User user);

	public List<User> combobox(User user);

	public void remove(String ids);

	public User edit(User user);

	public void modifyRole(User user);

	public void modifyPwd(User user);

}
