package EngineerInformationProcessing.basicSequence;
/*
 * ���� : -(1/2)+(2/3)-(4/5)....-(99/100)������ �հ踦 ���϶�
 * 1. Ȧ����°�� - �Ѵ�. ¦����°�� + �Ѵ�.
 * 2. 100���� �ݺ��Ѵ�.
 * 3. ������� �׾ƾ� �Ѵ�.
 */
public class UseSwitch02 {
	public UseSwitch02(){
		float i = 0, result = 0;
		while(i < 100){
			if((int)(i/2) == i/2){	//	¦����°
				result += i/(i+1);
				i++;
			}else{	//	Ȧ����°
				result -= i/(i+1);
				i++;
			}			
		}
		System.out.printf("%f", result);
	}
	
}
