package dasom_202203;

public class mar_20_Mathod {
	
	public static void method1(String text, String line){
		//출력할 방법 //설계도
		System.out.println(text);
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		//출력하고싶은 내용//호출하는 곳.
		method1("dasom","*****");
		method1("kate","!!!!!!");
	}
}

-----------------------------------------------------------
=>출력 값 : 
dasom
*****
kate
!!!!!!
===========================================================

package dasom_202203;

public class mathod_return {
	
	public static String a() {
		return "dasom";
	}

	public static int one() {
		return 31;
	}


	public static void main(String[] args) {
		System.out.println("이름 : " + a());
		System.out.println("나이 : " + one());
	}
}

---------------------------------------------------------
=> 출력값 : 
이름 : dasom
나이 : 31

=========================================================

package dasom_202203;

public class mathod_return2 {

	public static String member(String text, int a) {

		String out = "";
		out = out + a + "\n";
		out = out + text + "\n";

		return out;
	}

	public static void main(String[] args) {

		System.out.println(member("dasom", 31));
	}
}

------------------------------------------------------------
출력 값 : 
31
dasom
============================================================
