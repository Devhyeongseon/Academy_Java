package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		//가격형식만 찾아서 순서대로 출력
		String str = "헠4,500원 크크크 1,200,000,000원?? 6000원엨 120000원";
		
		String pattern = "[0-9+,*]+원";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
	}
}
