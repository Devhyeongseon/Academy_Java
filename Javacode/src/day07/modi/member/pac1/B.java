package day07.modi.member.pac1;

public class B {

	A a = new A(1); //public (o)
	A a2 = new A(true); //default (o)
	//A a3 = new A("홍길동"); //private (x)
	
	//생성자에 private붙여서 외부에서 객체 생성을 못하도록 처리하기도 함
	
	//-------------------------------------------------------
	
	public B() {
		
		A a = new A();
		a.var1 = 1;
		a.var2 = 2;   //default (o)
		//a.var3 = 3; //private (x)
		
		a.method01();
		a.method02(); //default (o)
		//a.method03(); //private (x)
		
	}
	
	
	
	
	
	
	
	
	
	
}
