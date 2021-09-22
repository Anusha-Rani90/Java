package javabasics;

import java.util.TreeSet;

public class DemoTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(25);
		//ts.add('t');
		ts.add(20);
		ts.add(5);
		ts.add(30);
		//ts.add(null);
		//ts.descendingSet();
		System.out.println(ts.descendingSet());
	}

}
