package EngineerInformationProcessing.basicSequence;
/*
 * 문제 : 1+3+6+10+15+21+28+…의 순서로 나열되는 수열의 20번째 항까지의 합계를 구하는 순서도를 작성하시오.
 * 1. subSequence는 2, 3, 4, 5... 이다.
 * 2. 첫항과 둘째항의 합은 4이다.
 * 3. 결과값을 쌓는다.
 * 
 */

public class SubSequence02 {
	public SubSequence02(){
		int subSequence = 2, subSequenceResult = 1, result = 1;
		while(subSequence < 21){
			subSequenceResult = subSequenceResult + subSequence;
			subSequence++;
			result = result + subSequenceResult;
		}
		System.out.printf("%d", result);
	}
}
