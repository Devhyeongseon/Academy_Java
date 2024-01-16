package api.lang.sbbuffer;

public class SbBufferEx {

	public static void main(String[] args) {
		
		//buffer, builder는 기능은 동일합니다.
		//buffer는 쓰레드환경에서 동기화기능제공, builder는 싱글스레드에서만 사용하는게 좋습니다.
		
		//StringBuilder sb2 = new StringBuilder("Java");

		StringBuffer sb = new StringBuffer("Java");
		String s = new String("Java");
		
		//문자열의 덧셈
		s = s + " program"; //새로운 객체가 생성됨
		sb.append(" program"); //원본 sb가 변함
		
		System.out.println(sb);
		System.out.println(s);
		
		//중간에 추가 insert
		sb.insert(5, "support ");
		System.out.println(sb);
		
		//문자열 변경 replace
		sb.replace(5, 12, "hello"); //이상~미만
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 11); //이상~미만
		System.out.println(sb);
		
		sb.deleteCharAt(0); //한글자 삭제
		System.out.println(sb);
		
		//문자열 로꾸꺼
		sb.reverse();
		System.out.println(sb);
		
//		if(s.equals(sb) ) { //String vs StringBuffer
//		}
		//문자열로 변경후 비교
		if( sb.toString().equals(s)  ) {
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
