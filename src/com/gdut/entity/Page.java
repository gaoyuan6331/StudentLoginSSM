package com.gdut.entity;

public class Page {
	private int startIndex; // 第一条记录在数据库位置
	private int pageSize; // 每页显示记录数
	private int pageNo; // 当前页码
	private int prePage; // 上一页
	private int nextPage; // 下一页
	private int totalCount; // 总记录数
	private int totalPage; // 总页数

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPrePage() {
		return prePage;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "Page [startIndex=" + startIndex + ", pageSize=" + pageSize + ", pageNo=" + pageNo + ", prePage="
				+ prePage + ", nextPage=" + nextPage + ", totalCount=" + totalCount + ", totalPage=" + totalPage + "]";
	}

	public Page(int startIndex, int pageSize, int pageNo, int prePage, int nextPage, int totalCount, int totalPage) {
		super();
		this.startIndex = startIndex;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.prePage = prePage;
		this.nextPage = nextPage;
		this.totalCount = totalCount;
		this.totalPage = totalPage;
	}

	public Page() {
		super();
	}

}
