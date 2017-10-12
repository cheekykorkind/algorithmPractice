package EngineerInformationProcessing.basicSequence;

/*
 * 문제 : 1-2+3-4+5-6....-100까지의 합계를 구하라
 * 1. 홀수번째는 - 한다. 짝수번째는 + 한다.
 * 2. 100까지 반복한다.
 * 3. 결과값을 쌓아야 한다.
 */

public class useSwitch01 {
	public useSwitch01(){
		int result = 1;
		int i, n, toggle;
		i = toggle = 1;
		while(i < 100){
			if(toggle == 1){
				result = result - (i+1);
				i++;
				toggle = 0;
			}else{
				result = result + (i+1);
				i++;
				toggle = 1;				
			}
		}
		System.out.printf("%d", result);
	}
}
