package z_codingTest406;

public class Q01 {
	/*
	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	
	1) 1 ≤ numbers의 길이 ≤ 9
	2) 0 ≤ numbers의 모든 원소 ≤ 9
	3) numbers의 모든 원소는 서로 다릅니다.
	
	<< 입출력 예 >>
	1) numbers = [1,2,3,4,6,7,8,0] ==> result = 14
		: 5,9가 numbers에 없으므로 5 + 9 = 14를 return 해야 함
	2) numbers = [5,8,4,0,6,7,9] ==> result = 6
		: 1,2,3이 numbers에 없으므로 1 + 2 + 3 = 6을 return 해야 함
	*/

	public static void main(String[] args) {
		
		int[] numbers1 = new int[] {1,2,3,4,6,7,8,0};
		int[] numbers2 = new int[] {5,8,4,0,6,7,9};
		
		System.out.println(solution(numbers1));
		System.out.println(solution(numbers2));
	}
	
	
	public static int solution(int[] x) {
		int allSum = 0;
		int sum = 0;
		//x
		for(int i = 0 ; i < 10 ; i++) {
			allSum += i; 
		}
		
		for(int i = 0 ; i < x.length ; i++) {
			sum += x[i];
		}
		
		
	int answer = allSum - sum;
		return answer;
	
}
}

