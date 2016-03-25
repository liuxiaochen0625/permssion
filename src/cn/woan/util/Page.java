package cn.woan.util;

import java.util.List;

public class Page<T> {

	protected Integer pageNo = 1;
	protected Integer pageSize = -1;
	protected Boolean autoCount = Boolean.TRUE;
	protected List<String> orderList = CollectionUtil.newArrayList();
	protected List<String> ascOrderList = CollectionUtil.newArrayList();
	protected List<String> descOrderList = CollectionUtil.newArrayList();

	protected List<T> result = CollectionUtil.newArrayList();
	protected List<?> multiFieldResult = CollectionUtil.newArrayList();
	protected Long totalCount = -1L;
	protected Boolean lastPage=true;
	protected Boolean firstPage=true;
	protected Long totalPage;
	private Integer prePage;
	private Integer nextPage;
	
	public Page() {
	}

	/**
	 * @return the multiFieldResult
	 */
	public List getMultiFieldResult() {
		return multiFieldResult;
	}

	/**
	 * @param multiFieldResult the multiFieldResult to set
	 */
	public void setMultiFieldResult(List<?> multiFieldResult) {
		this.multiFieldResult = multiFieldResult;
	}

	public Page(int pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public Page<T> setPageNo(Integer pageNo) {
		if(pageNo==null) pageNo=1;
		this.pageNo = pageNo;
		
		if (pageNo < 1) {
			this.pageNo = 1;
		}
		return this;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public Page<T> setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	public Integer getFirst() {
		return ((pageNo - 1) * pageSize) + 1;
	}

	public Boolean getAutoCount() {
		return autoCount;
	}

	public Page<T> setAutoCount(Boolean autoCount) {
		this.autoCount = autoCount;
		return this;
	}

	public List<T> getResult() {
		return result;
	}

	public Page<T> setResult(List<T> result) {
		this.result = result;
		return this;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public Page<T> setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
		return this;
	}

	public Long getTotalPages() {
		if (totalCount < 0) {
			return -1L;
		}

		Long count = totalCount / pageSize;
		if (totalCount % pageSize > 0) {
			count++;
		}
		return count;
	}

	public Boolean getHasNext() {
		return (pageNo + 1 <= getTotalPages());
	}

	public Integer getNextPage() {
		if (getHasNext()) {
			return pageNo + 1;
		} else {
			return pageNo;
		}
	}

	public Boolean getHasPre() {
		return (pageNo - 1 >= 1);
	}

	public Integer getPrePage() {
		if (getHasPre()) {
			return pageNo - 1;
		} else {
			return pageNo;
		}
	}
	
	//
	public List<String> getOrderList() {
		return orderList;
	}
	
	public List<String> getAscOrderList() {
		return ascOrderList;
	}
	
	public List<String> getDescOrderList() {
		return descOrderList;
	}
	
	public Page<T> asc(String column) {
		orderList.add(column + " ASC");
		ascOrderList.add(column);
		return this;
	}
	
	public Page<T> desc(String column) {
		orderList.add(column + " DESC");
		descOrderList.add(column);
		return this;
	}

	/**
	 * toeasting@hotmail.com-2012/03/13 08:15:40
	 * 
	 * @return  the lastPage
	 * @since   0.5
	 */
	public boolean getLastPage() {
		return this.getHasNext();
	}

	/**
	 * @param lastPage the lastPage to set
	 */
	public void setLastPage(Boolean lastPage) {
		this.lastPage = lastPage;
	}

	/**
	 * toeasting@hotmail.com-2012/03/13 08:15:40
	 * 
	 * @return  the firstPage
	 * @since   0.5
	 */
	public boolean getFirstPage() {
		return getHasPre();
	}

	/**
	 * @param firstPage the firstPage to set
	 */
	public void setFirstPage(Boolean firstPage) {
		this.firstPage = firstPage;
	}

	/**
	 * toeasting@hotmail.com-2012/03/13 08:20:08
	 * 
	 * @return  the totalPage
	 * @since   0.5
	 */
	public Long getTotalPage() {
		return getTotalPages();
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @param prePage the prePage to set
	 */
	public void setPrePage(Integer prePage) {
		this.prePage = prePage;
	}

	/**
	 * @param nextPage the nextPage to set
	 */
	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	
}