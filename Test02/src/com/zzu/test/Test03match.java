package com.zzu.test;

import java.util.Stack;

public class Test03match {

	 /** 
     * 判断一个字符串中的"( )"是否配对  
     * 输入：if(a.equals(a)) 输出：true 
     * @param args 
     */  
    public static void main(String[] args) {  
        String str = "if(a.(equals(a)))";  
        boolean result = isMatch(str);  
        System.out.println("字符串中的()是否配对：" + result);  
    }  
	
	
	/** 
     * 判断（）内的字符是否匹配 
     *  
     * @param str 
     * @return 
     */  
    private static boolean isMatch(String str) {  
        boolean result = false;  
        int count = 0;  
        char[] array = str.toCharArray();  
        for (int i = 0; i < array.length; i++) {  
            if (array[i] == '(') {  
                count++;  
            } else if (array[i] == ')') {  
                count--;  
            }  
        }  
        if (count == 0) {  
            result = true;  
        }  
        return result;  
    }  
    
    
    /**
     * 执行push时(即，将元素推入栈中)，是通过将元素追加的数组的末尾中。
     
                 执行pop时(即，取出栈顶元素，并将该元素从栈中删除)，是取出数组末尾的元素，然后将该元素从数组中删除。
     */
    
    public boolean isDouble(String data) {
		Stack<Character> stack = new Stack<Character>();//栈 先进后出(FILO, First In Last Out)。
		String biStr = String.valueOf(data);
		boolean flag = false;
		char[] arr = biStr.toCharArray();//数组
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				stack.push(arr[i]);//入
			} else if (arr[i] == ')') {
				if (!stack.isEmpty() && stack.get(0) == '(') {
					stack.pop();//出
				} else if (stack.isEmpty()) {
					flag = false;
					return flag;
				}
			} else {
				// nothing
			}
		}
		if (stack.isEmpty()) {
			flag = true;
		}
		return flag;
	}


}
