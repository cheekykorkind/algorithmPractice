package EngineerInformationProcessing.basicSequence;

/*
 * ���� : 1-2+3-4+5-6....-100������ �հ踦 ���϶�
 * 1. Ȧ����°�� - �Ѵ�. ¦����°�� + �Ѵ�.
 * 2. 100���� �ݺ��Ѵ�.
 * 3. ������� �׾ƾ� �Ѵ�.
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
