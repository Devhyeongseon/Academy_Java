package day08.static_.method;

import java.util.Arrays;

import day01.Sysout;

public class MainClass {

	public static void main(String[] args) {
		
		//main은 static입니다
		//a변수를 사용하고 싶으면 객체생성을 해서 사용함.
		Count c = new Count();
		c.method();
		System.out.println(c.b);
		
		//static멤버를 호출할 때
		Count.b++;
		System.out.println(c.b);
		Count.method2();
		System.out.println(c.b);
		System.out.println(Count.method2());
		System.out.println(c.b);
		
		//현재 b는 몇일까요? 3
		Math.random();
		String.join("-", "010", "1234", "5678");
		Integer.parseInt("3");
	
		
		
	}
	
}
