package com.company.neulbom.Domain;

public class Criteria {

	private int page;
	private int perPageNum;
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page <=1){
			this.page = 1;
			return;
		}
		this.page = page;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <=0 || perPageNum > 100){ // || = �Ǵ� �̶�� �� ������ Ȥ�ø𸣴� 0���� �����ټ����հ�
			// �̻��ϰ� ��û�ϸ� 100���� �����ְ� ������� 10 ���� ������
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	public int  getPageStart(){
		return(this.page-1)*perPageNum+1;
	}
	public int  getPageEnd(){
		return (this.page-1)*perPageNum + perPageNum;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
}