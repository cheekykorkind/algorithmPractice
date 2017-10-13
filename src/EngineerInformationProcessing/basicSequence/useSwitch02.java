package EngineerInformationProcessing.basicSequence;
/*
 * 문제 : -(1/2)+(2/3)-(4/5)....-(99/100)까지의 합계를 구하라
 * 1. 홀수번째는 - 한다. 짝수번째는 + 한다.
 * 2. 100까지 반복한다.
 * 3. 결과값을 쌓아야 한다.
 */
public class UseSwitch02 {
	public UseSwitch02(){
		float i = 0, result = 0;
		while(i < 100){
			if((int)(i/2) == i/2){	//	짝수번째
				result += i/(i+1);
				i++;
			}else{	//	홀수번째
				result -= i/(i+1);
				i++;
			}			
		}
		System.out.printf("%f", result);
	}
	
}
