package api.thread.runable;

public class MainClass2 {

	public static void main(String[] args) {
		
		//객체 1개, 쓰레드는 2개 생성
		ThreadTest t = new ThreadTest();
		
		Thread thread = new Thread(t, "A");
		Thread thread2 = new Thread(t, "B");
		
		thread.start();
		thread2.start();
		
		
		System.out.println("main쓰레드 종료");
	}
}
