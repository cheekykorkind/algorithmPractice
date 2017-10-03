package sort;
/* �迭�� �ι�° ���ڿ� ù��° ���ڸ� ���ؼ� �ι�° ���ڰ� ������ �ι�°�� ù��° �տ� �о�ִ´�.
 * �迭�� ����° ���ڿ� 1~2���� ���ڸ� ���ؼ� ����° ���ڰ� n��° ���� ������ �� �տ� �о�ִ´�.
 * ���� ���� ������? ���� index�� �迭 ���̿� ����������. 
 * ������ : {3,7,2,5,1,4}
 */
public class InsertionSort {
	private int[] _data;
	public InsertionSort(int[] data){
		this._data = data;
		this.sort();
	}
	private void sort(){
		int index = 1;
		int leftIndex;
		int temp;
		while(index < _data.length){
			leftIndex = index-1;
			//	���ذ��� �񱳴�󺸴� ������ �񱳴��� �ڸ��� �ٲ۴�.
			while((leftIndex >= 0) && (_data[leftIndex] > _data[leftIndex+1])){	// ���ذ� index�� ��ġ�� �������� �̵��ϴ� ���������̶�� �����ϸ� ���ϴ�.
				temp = _data[leftIndex];
				_data[leftIndex] = _data[leftIndex+1];
				_data[leftIndex+1] = temp;
				leftIndex--;
			}
			index++;
		}
		for(int i = 0; i < _data.length; i++){
			System.out.print(_data[i]+ " ");
		}
	}
}
