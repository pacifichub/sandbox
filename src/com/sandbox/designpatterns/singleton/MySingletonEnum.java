package com.sandbox.designpatterns.singleton;

public enum MySingletonEnum {
	
	INSTANCE;
	
	private int counter;
	
	public void doStuffInSingleton(){
		System.out.println("MySingletonEnum.doStuffInSingleton()"+this.counter++);
	}

	public static void main(String[] args) {
		MySingletonEnum.INSTANCE.doStuffInSingleton();
		MySingletonEnum.INSTANCE.doStuffInSingleton();
	}
}

