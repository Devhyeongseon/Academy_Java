package api.lang.wrapper;

public class BoxingEx01 {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing = 기본타입을 => 객체형으로 변환
		
		Integer v1 = new Integer(a);
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);
		
		//System.out.println(v1);
		Object[] arr = {v1, v2, v3, v4 };
		
		//unboxing = 객체형 => 기본타입으로 변환
		int x = v1.intValue(); 
		double y = v2.doubleValue();
		char k = v3.charValue();
		boolean j = v4.booleanValue();
		
		System.out.println("--------------------------");
		//autoboxing = 자동형변환
		Integer a1 = a;
		int a2 = a1;
		
		Object[] arr2 = {1, 3, 3.14, true };
		
		
		
	}
}
