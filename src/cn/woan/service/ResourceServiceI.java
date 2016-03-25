package cn.woan.service;

import java.util.List;

import cn.woan.pageModel.Resource;

public interface ResourceServiceI {

	public List<Resource> treegrid();

	public List<Resource> allTreeNode();

	public Resource add(Resource resource);

	public void remove(String id);

	public Resource edit(Resource resource);

}
