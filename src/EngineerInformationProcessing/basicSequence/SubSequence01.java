package EngineerInformationProcessing.basicSequence;
/*
 * 문제 : 1+2+4+7+11+16.... 20번째 항까지의 합계를 구하라
 * 1. 등차수열의 공차를 다른 등차수열로 구한다.
 * 2. 1에서 구한 공차를 등차수열에 적용한다.
 * 3. 결과값을 쌓는다.
 * 풀고나서 : 몇항에서 어떤 값을 더해야 하는지 정확히 파악하는게 중요하다. 규칙만 찾아서는 결과가 다를수 있다.
 */
public class SubSequence01 {
	public SubSequence01(){
		int subSequence = 1, subSequenceResult = 1;
		int result = 1;
		while(subSequence < 20){
			subSequenceResult += subSequence; 
			subSequence++;
			result += subSequenceResult;
		}
		System.out.printf("%d", result);
	}
}
