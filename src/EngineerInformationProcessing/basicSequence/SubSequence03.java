package EngineerInformationProcessing.basicSequence;
/*
 * ���� : -1+2-4+7-11+16-22+���� ������ �����Ǵ� ������ 20��° �ױ����� �հ踦 ���Ͻÿ�.
 * 1. subSequence�� 1, 2, 3... �̴�.
 * 2. 1���� ���� ������ ���������� �����Ѵ�.
 * 3. ������� ������ Ȧ���� ������ +, ¦���� ������ -�� ����Ѵ�.
 */
public class SubSequence03 {
	public SubSequence03(){
		int subSequence = 1, subSequenceResult = 1, result = -1;
		while(subSequence < 20){
			if(subSequence % 2 != 0){	//	������ Ȧ���̴�
				subSequenceResult = subSequenceResult + subSequence; 
				result = result + subSequenceResult;
				subSequence++;				
			}else{	//	������ ¦���̴�
				subSequenceResult = subSequenceResult + subSequence; 
				result = result - subSequenceResult;
				subSequence++;						
			}
		}
		System.out.printf("%d", result);
	}
}
