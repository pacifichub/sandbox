package com.sandbox.designpatterns.singleton;

public class MySingletonDoubleCheckedLocking {
	private static MySingletonDoubleCheckedLocking instance = null;
	
	private MySingletonDoubleCheckedLocking(){}
	
	public static MySingletonDoubleCheckedLocking getInstance(){
		if(instance == null){
			synchronized (MySingletonDoubleCheckedLocking.class) {
				if(instance == null){
					instance = new MySingletonDoubleCheckedLocking();
				}
			}
		}
		
		return instance;
	}
	

}
