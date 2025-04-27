package com.example.demo.designPattern.singleton;

/**
 * 方法加了锁，适用于多线程情况，但是影响效率
 * 
 * @author luoluo
 *
 */
public class SingletonSecond {
	public static SingletonSecond instance;

	private SingletonSecond() {
	}

	public static synchronized SingletonSecond getInstance() {
		if (instance == null) {
			instance = new SingletonSecond();
		}
		return instance;
	}
}
