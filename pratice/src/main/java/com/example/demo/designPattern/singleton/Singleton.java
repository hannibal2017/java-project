package com.example.demo.designPattern.singleton;
/**
 * 基本实现方式，不适用于多线程方式
 * @author luoluo
 *
 */
public class Singleton {
	public volatile static Singleton instance;
    
	//构造函数private，禁止通过new来创建对象
	private Singleton() {
	}
   // 获取实例方法
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
