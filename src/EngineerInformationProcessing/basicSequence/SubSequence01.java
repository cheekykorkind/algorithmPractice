package EngineerInformationProcessing.basicSequence;
/*
 * ���� : 1+2+4+7+11+16.... 20��° �ױ����� �հ踦 ���϶�
 * 1. ���������� ������ �ٸ� ���������� ���Ѵ�.
 * 2. 1���� ���� ������ ���������� �����Ѵ�.
 * 3. ������� �״´�.
 * Ǯ���� : ���׿��� � ���� ���ؾ� �ϴ��� ��Ȯ�� �ľ��ϴ°� �߿��ϴ�. ��Ģ�� ã�Ƽ��� ����� �ٸ��� �ִ�.
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
