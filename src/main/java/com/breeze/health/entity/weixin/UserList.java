package com.breeze.health.entity.weixin;

import java.util.List;

public class UserList {
	 // 总关注用户数  
    private int total;  
    // 获取的OpenId个数  
    private int count;  
    // OpenId列表  
    private UserData data;  
    // �?���?��用户的openid  
    private String next_openid;  
    
    public class UserData {  
    	  
        private List<String> openid;  
      
        public List<String> getOpenid() {  
            return openid;  
        }  
      
        public void setOpenid(List<String> openid) {  
            this.openid = openid;  
        }  
    }  

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public UserData getData() {
		return data;
	}

	public void setData(UserData data) {
		this.data = data;
	}

	public String getNext_openid() {
		return next_openid;
	}

	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
    
}
