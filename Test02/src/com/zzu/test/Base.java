package com.zzu.test;

public class Base {
private String baseName = "base";
public Base(){
	System.out.println("--1--");
callName();
System.out.println("--2--");
    }
public void callName(){
System.out.println(baseName);
    }
}
