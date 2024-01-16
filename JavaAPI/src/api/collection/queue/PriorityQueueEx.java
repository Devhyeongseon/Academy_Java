package api.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		//우선순위큐 - 자동 정렬됨
		PriorityQueue<Integer> que = new PriorityQueue<>();
		
		que.offer(3);
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(2);
		
		System.out.println(que.toString());
		
		//데이터꺼내기
		System.out.println( que.poll() ); //1
		System.out.println( que.poll() ); //2
		System.out.println( que.poll() ); //3
		System.out.println( que.poll() ); //3
 		System.out.println( que.poll() ); //4
		
		System.out.println("-----------------------------------------");
 		
		//객체를 Que에 넣는 작업
		//객체를 Que에 넣을 때는 우선순위를 지정하는 방법이 정의되어야 합니다.
 		
		PriorityQueue<Person> q = new PriorityQueue<>();
		
		
		//a > 0 뒤에가 우선순위, a < 0 앞에가 우선순위, a == 0 같음
		System.out.println("홍길동".compareTo("홍길자") );
		
		q.offer( new Person("홍길동", 20) );
		q.offer( new Person("홍길자", 30) );
		q.offer( new Person("이순신", 40) );
		q.offer( new Person("피카츄", 50) );
		
		
		System.out.println(  q.poll() );
		System.out.println(  q.poll() );
		System.out.println(  q.poll() );
		System.out.println(  q.poll() );
		
		
		Person p = new Person("sdf", 1);

		
		
		
		
		
	}
}
