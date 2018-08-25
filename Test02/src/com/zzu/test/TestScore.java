package com.zzu.test;

public class TestScore extends Base {
private String baseName = "sub";

TestScore(){
	//System.out.println("zzz1");
	super();
	System.out.println("zzz");
}
public void callName() {
System.out.println(baseName);
    }

public static void main(String[] args) {
        Base b = new TestScore();
    }
}


