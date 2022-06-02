package dasom_202203;

public class method_return_accounting01 {
		
	public static void main(String[] args) {
		//공급가액
		double valueOfSupply = 10000.0;
		
		//부가가치세율(10%)
		double vatRate = 0.1;
		
		//부가세
		double vat = valueOfSupply * vatRate;
		//double vat = getVAT();
		//합계
		double total = valueOfSupply + vat;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + vat);
		System.out.println("Total : "+ total);
		
	}
}
=================================================================
//위의 내용을 public staitc을 통해 가독성을 더 높인 것


package dasom_202203;

public class method_return_accounting02 {
	
	//공급가액
	public static double valueOfSupply = 10000.0;
	//부가가치세율(10%)
	public static double vatRate = 0.1;
	//부가세
	public static double getVAT(){
		return valueOfSupply * vatRate;
	}
	//공급가액과 부가세의 합계
	public static double getTotal() {
		return valueOfSupply+getVAT();
	}
	
  
	public static void main(String[] args) {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("Vat : " + getVAT());
		System.out.println("Total : "+ getTotal());
	}
}

------------------------------------------------------------
출력 결과 : 
Value of supply : 10000.0
Vat : 1000.0
Total : 11000.0
============================================================
