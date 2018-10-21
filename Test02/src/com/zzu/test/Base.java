package com.zzu.test;
/**
 * 测试
 * @author Administrator
 *
 */
public class Base {
	private String baseName = "base";
    //分支测试开发
	public Base() {
		System.out.println("--1--");
		callName();
		System.out.println("--2--");
	}
    //本地分支修改
	public void callName() {
		System.out.println(baseName);
		System.out.println("dev分支上开发");
	}
}
