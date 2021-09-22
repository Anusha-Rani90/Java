package javabasics;

import java.util.HashMap;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(10, 100);
		map.put(20, 200);
		map.put(30, 300);
		map.put(40, 400);
		map.put(10, 600);
		map.put(25, 200);
		map.put(null, 500);
		map.put(null, 700);
		map.put(50, null);
		map.put("ab", null);
		System.out.println(map);
	}

}
