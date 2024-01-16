package api.generic.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		//여러분이 자바를 사용하다보면 ? 라고 하는 제네릭 문법이 보입니다.
		//List<?> = 리스트면 무엇이든 다 들어갈 수 있음
		//List<? extends String> = ?가 String타입의 자식은 들어갈 수 있음
		//List<? super Integer> = ?가 Integer의 형태가 될 수 있다면 들어갈 수 있음 (Integer의 부모라면)
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(1,2);
		System.out.println(list2);
		
		System.out.println(list.containsAll(list2)); //1,2가 포함되어있다면 true
		
		
		System.out.println("------------------------------------------------");
		
		List<String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Object> l3 = new ArrayList<Object>();
		
		//add1(l1);
		//add1(l2);
		//add1(l3);
		
//		add2(l1);
//		add2(l2); //x
//		add2(l3); //x
		
//		add3(l1); //x
//		add3(l2); 
//		add3(l3); 
		
	}
	
	public static void add1(List<?> list) {
	}
	
	public static void add2(List<? extends String> list ) {
	}

	public static void add3(List<? super Integer> list) {
	}
	
	
	
	
	
	
	
	
	
}
