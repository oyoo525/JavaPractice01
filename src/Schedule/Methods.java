package Schedule;

import java.util.Scanner;

public class Methods {
	private static String title;
	private static String document;


	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		Methods.title = title;
	}
	public static String getDocument() {
		return document;
	}
	public static void setDocument(String document) {
		Methods.document = document;
	}

	static public String naming() {
		System.out.print("제목을 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		String naming = scan.nextLine();
		return title = naming;
	}
	static public String doc() {
		System.out.println("내용을 입력해주세요 : \n입력을 중지하려면 마지막줄에 \"끝\"이라고 적어주세요\n");
		Scanner scan = new Scanner(System.in);
		String doc = scan.nextLine();
		String doc2 = "";
		while(doc2 != "끝") {
			doc2 = scan.nextLine(); 
			if(doc2.trim().equals("끝")) {
				break;
			} else {
				doc +=  "\n" + doc2;
			}
		}
		return document = doc;
	}
	static public String newMemo() {
		naming();
		doc();
		return "제목 : " + title + "\n내용 : \n" + document;
	}


	

}
