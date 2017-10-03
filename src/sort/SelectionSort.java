package sort;
/*
 * 1. ������������ �����Ѵ�.
 * 2. ù��° ���Һ��� n��° ���Ҹ� ���ϸ鼭 �������� index�� ����Ѵ�.
 * 3. data�� 1 ��ȸ�ϸ� 2 ��ȸ�� �ι�° ���Һ��� ��ȸ�� �����Ѵ�.
 * 4. data�� 2 ��ȸ�ϸ� 3 ��ȸ�� ������ ���Һ��� ��ȸ�Ѵ�.
 * 5. 3.�� 4.�� data�� ������ ���ұ��� ����Ѵ�.
 * ������ : [9,1,6,8,4,3,2,0] 
 */
public class SelectionSort {
	private int[] _data;
	public SelectionSort(int[] unsortedData){
		this._data = unsortedData;
		this.sort();
	}
	
	private void sort(){
		int currentMinimum, temp;
		for(int i = 0; i < _data.length-1; i++){	//	data�� ���� ��ȸ�Ѵ�.
			currentMinimum = i;	//	data�� i��° ��ȸ������ i+1��° ��ȸ�� ���� ������ ��ġ�� i+1��° �̴�.
			for(int n = i+1; n < _data.length-1; n++){
				if(_data[n] < _data[currentMinimum]){	//	���� ���Ҹ� �߰��ϸ� index�� ����Ѵ�.
					currentMinimum = n;
				}
			}
			// ���� ���� ���Ҹ� ���� �������� �ű��.
			temp = _data[i];
			_data[i] = _data[currentMinimum];
			_data[currentMinimum] = temp;
			System.out.print(_data[i] + " ");
		}
	}
}
