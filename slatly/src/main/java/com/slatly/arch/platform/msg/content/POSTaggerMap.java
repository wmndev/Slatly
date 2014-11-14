package com.slatly.arch.platform.msg.content;

import java.util.HashMap;

public class POSTaggerMap<K,V> extends HashMap<String, Integer> {
	
	private static final long serialVersionUID = 8351309842081785884L;

	public Integer put(String key){
		Integer num = super.get(key);
		if (num == null){
			num = 0;
		}
		super.put(key, ++num);
		return num;		
	}

}
