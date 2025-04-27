package com.example.demo.designPattern.singleton;

public class SingleTest {

	public static void main(String[] args) {
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		System.out.println("两个对象是否相等：" + (single1.equals(single2)));// true
		System.out.println("两个对象是否相等：" + (single1 == single2));// true

		SingletonSecond ss1 = SingletonSecond.getInstance();
		SingletonSecond ss2 = SingletonSecond.getInstance();
		System.out.println("两个对象是否相等：" + (ss1.equals(ss2)));// true

		SingletonThird st1 = SingletonThird.getInstance();
		SingletonThird st2 = SingletonThird.getInstance();
		System.out.println("两个对象是否相等：" + (st1.equals(st2)));// true
	}
}
