package com.accp.springboot.util;

import java.util.List;




/**
 * 分页工具类
 * @author 小虎
 *
 */
public class PageBean {
		private List list; //用户展示的数据
		private int curr; //当前的页数
		private int prev; //上一页
		private int  next;//下一页
		private int last;//尾页
		private int total;//总数
		private int size;//每页的实体记录
		public PageBean( int curr, int total, int size,List list) {
			super();
			this.list = list;
			this.curr = curr;
			this.total = total;
			this.size = size;
			//上一页     
			this.prev=curr-1==0?1:curr-1;
			//尾页  
			this.last=total%size==0?total/size:total/size+1;
			//下一页
			this.next=curr+1>this.last?this.last:curr+1;
		}
		public List getList() {
			return list;
		}
		public void setList(List list) {
			this.list = list;
		}
		public int getCurr() {
			return curr;
		}
		public void setCurr(int curr) {
			this.curr = curr;
		}
		public int getPrev() {
			return prev;
		}
		public void setPrev(int prev) {
			this.prev = prev;
		}
		public int getNext() {
			return next;
		}
		public void setNext(int next) {
			this.next = next;
		}
		public int getLast() {
			return last;
		}
		public void setLast(int last) {
			this.last = last;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}

}
