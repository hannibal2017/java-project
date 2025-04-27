package com.example.demo.designPattern.singleton;

public class SingletonThird {
	public static SingletonThird instance;

	private SingletonThird() {
	}

	public static  SingletonThird getInstance() {
		if (instance == null) {
			synchronized (SingletonThird.class) {
				if (instance == null) {
					instance = new SingletonThird();
				}
			}
		}
		return instance;
	}
}
