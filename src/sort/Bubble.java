package sort;

	// �������� ������ ��ǥ��.
public class Bubble {
	int [] bubbleDatas = {88, 55, 22, 77, 11, 44, 33, 99, 66};
	public Bubble(){
		sort();
	}
	private void sort(){
		for(int i = 0; i < bubbleDatas.length; i++){
			for(int n = 0; n < bubbleDatas.length-i; n++){
				if(n+1 < bubbleDatas.length && bubbleDatas[n] > bubbleDatas[n+1]){	//	������ ũ�� ���������� �Űܾ� �Ѵ�.
					int temp =  bubbleDatas[n+1];
					bubbleDatas[n+1] = bubbleDatas[n];
					bubbleDatas[n] = temp;
				}				
			}
		}
		for(int c = 0; c < bubbleDatas.length; c++){
			System.out.println(bubbleDatas[c]);
		}
	}
}
