package EngineerInformationProcessing.basicSequence;
/*
 * ���� : 1+3+6+10+15+21+28+���� ������ �����Ǵ� ������ 20��° �ױ����� �հ踦 ���ϴ� �������� �ۼ��Ͻÿ�.
 * 1. subSequence�� 2, 3, 4, 5... �̴�.
 * 2. ù�װ� ��°���� ���� 4�̴�.
 * 3. ������� �״´�.
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
