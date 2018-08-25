package com.zzu.test;
/**
 * 测试
 * @author Administrator
 *
 */
public class Base {
	private String baseName = "base";

	public Base() {
		System.out.println("--1--");
		callName();
		System.out.println("--2--");
	}

	public void callName() {
		System.out.println(baseName);
	}
}
