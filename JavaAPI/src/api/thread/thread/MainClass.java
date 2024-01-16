package api.thread.thread;

public class MainClass {

	public static void main(String[] args) {
		
		//Thread객체를 상속 받앗으므로
		ThreadTest t = new ThreadTest();
		t.setName("A"); //쓰레드 이름 지정
		t.start();
		
		
		System.out.println("main스레드 종료");
		
		
	}
}
