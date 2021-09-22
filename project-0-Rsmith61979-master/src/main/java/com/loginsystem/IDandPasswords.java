package com.loginsystem;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		
		logininfo.put("Ryan","Buddy1979");
		logininfo.put("Smith","Buddy@1979");
		logininfo.put("Help","Me");
	}
	
	protected HashMap getLoginInfo(){
		
		return logininfo;
	}

}
