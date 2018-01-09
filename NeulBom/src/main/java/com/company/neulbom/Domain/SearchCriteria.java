package com.company.neulbom.Domain;

import java.net.URLEncoder;

import org.springframework.stereotype.Repository;

@Repository
public class SearchCriteria extends Criteria {
	
	private String searchType;
	private String keyword;	
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
	//	System.out.println("keyword:"+keyword);
		return keyword;
	}
	public void setKeyword(String keyword) {
		
		this.keyword = keyword;
	}
	
	@Override
	public String toString() {
		return "SearchCriteria [page=" + super.getPage() + ", perPageNum=" + super.getPerPageNum() + ",keyword="+keyword+",searchType="+searchType+"]";
	}
}