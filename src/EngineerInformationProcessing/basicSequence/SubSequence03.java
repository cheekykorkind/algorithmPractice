package EngineerInformationProcessing.basicSequence;
/*
 * 문제 : -1+2-4+7-11+16-22+…의 순서로 나열되는 수열의 20번째 항까지의 합계를 구하시오.
 * 1. subSequence는 1, 2, 3... 이다.
 * 2. 1에서 구한 공차를 등차수열에 적용한다.
 * 3. 결과값을 쌓을때 홀수항 시작은 +, 짝수항 시작은 -로 계산한다.
 */
public class SubSequence03 {
	public SubSequence03(){
		int subSequence = 1, subSequenceResult = 1, result = -1;
		while(subSequence < 20){
			if(subSequence % 2 != 0){	//	시작이 홀수이다
				subSequenceResult = subSequenceResult + subSequence; 
				result = result + subSequenceResult;
				subSequence++;				
			}else{	//	시작이 짝수이다
				subSequenceResult = subSequenceResult + subSequence; 
				result = result - subSequenceResult;
				subSequence++;						
			}
		}
		System.out.printf("%d", result);
	}
}
