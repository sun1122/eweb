package com.zzu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * 功能描述：删除字符串中字符个数最少的字符，最少字符串有多个，最少的要全部删除

               然后返回该子字符串。

输入：asdasdas

输出：asasas
 * 
 * 
 * 
 * 
 * Collections需要学习
 * 
 * public int compare(Object o1, Object o2) 返回一个基本类型的整型
如果要按照升序排序，
则o1 小于o2，返回-1（负数false），相等返回0，01大于02返回1（正数）

如果要按照降序排序
 则o1 小于o2，返回1（正数 true），相等返回0，01大于02返回-1（负数）

 * 
 * @author Administrator
 *
 */
public class Test01 {

	public static String deleteMinChar(String data) {
		//判断为null "" 
		if (data == null) {
			return null;
		}
		if (data.length() == 0) {
			return "";
		}
		// 将字符串转为数组
		char[] ch = data.toCharArray();
		// 创建Map集合,key : 字符 , value : 字符的个数
		Map<Character, Integer> map = new HashMap<>();
		// 先将ch里面的元素的键填充进去,所有的value都是0 (利用了Map集合的键必须唯一特性)
		for (char c : ch) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);// value+1
			} else {
				
				map.put(c, 1);
			}
		}

		System.out.println(map);
		System.out.println("-------------------------第一种思想-----------------------");

		Collection<Integer> values = map.values();// 工具类要常用！
		int minIndex = Collections.min(values);// 直接借助collections找最值！
		StringBuffer sb = new StringBuffer();
		for (char keys : ch) {
			if (map.get(keys) != minIndex) {
				sb.append(keys);
			}
		}
		System.out.println(sb);

		System.out.println("-----------------------第二种思想-------------------------");
		// 这是一个比较大的数
		int num = Integer.MAX_VALUE;
		// 使用List集合存放最少的字符
		List<Character> list = new ArrayList<>();
		for (int i = 0; i < ch.length; i++) {
			if (map.get(ch[i]) < num) {
				// 如果当前遍历到的元素的个数小于上一个的元素的个数,那么就需要将比较的元素num换成当前这个元素的个数
				num = map.get(ch[i]);
				// 需要将list里面的元素都删除(因为发现还有更少的元素)
				list.clear();
				list.add(ch[i]);
			} else if (map.get(ch[i]) == num) {
				// 如果发现有相同少的个数的元素(那么这个元素也需要被添加到集合中,被删除)
				list.add(ch[i]);
			}
		}
		System.out.println("delete" + list);
		// 将list中的元素删除
		for (char c : list) {
			data = data.replace(String.valueOf(c), "");
		}

		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asdasdasdgg";
		System.out.println(deleteMinChar(str));
	}

}
