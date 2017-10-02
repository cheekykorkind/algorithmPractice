package sort;


// ������������ ���ĵ� �����Ͱ� �ִ�.
// ���� ū ���� ���� ���� ���� �߰����� ���Ѵ�.
// input���� �߰����� ��ġ�ϴ��� ���Ѵ�.
// input���� �߰������� ũ�� high�� low�� ������ middle�� ������ ������ �����Ѵ�.
// �ݺ��Ѵ�.
// ������ ������?
public class BinarySearch {
	int [] binaryDatas = {11, 22, 33, 44, 55, 66, 77, 88, 99};
	public BinarySearch(){
		search(66);	
	}
	private void search(int value){
		int low = 0;
		int high = binaryDatas.length-1;
		int middle = 0;
		while(value != binaryDatas[middle]){
			middle = (low + high) / 2;
			if(value == binaryDatas[middle]){
				System.out.println(middle);
				break;
			} else if(value > binaryDatas[middle]){	//	low�� high�� ������ ������ �����Ѵ�.
				low = middle + 1;
			} else if(value < binaryDatas[middle]){	//	low�� high�� ���� ������ �����Ѵ�.
				high = middle -1;
			}
		}
		
	}
}