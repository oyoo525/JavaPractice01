package Schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Action {

	private static StringBuilder date;

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss 저장됨");
		
		
		StringBuilder s1 = new StringBuilder();
		s1.append(Methods.newMemo());
		System.out.println("======= print =======");
		System.out.println(s1);
		System.out.println(formatter.format(date));
	}

}
