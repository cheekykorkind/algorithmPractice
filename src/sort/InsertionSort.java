package sort;
/* 배열의 두번째 인자와 첫번째 인자를 비교해서 두번째 인자가 작으면 두번째를 첫번째 앞에 밀어넣는다.
 * 배열의 세번째 인자와 1~2까지 인자를 비교해서 세번째 인자가 n번째 보다 작으면 그 앞에 밀어넣는다.
 * 루프 종료 조건은? 현재 index가 배열 길이와 같아졌을때. 
 * 데이터 : {3,7,2,5,1,4}
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
			//	기준값이 비교대상보다 작으면 비교대상과 자리를 바꾼다.
			while((leftIndex >= 0) && (_data[leftIndex] > _data[leftIndex+1])){	// 기준값 index의 위치가 왼쪽으로 이동하는 버블정렬이라고 생각하면 편하다.
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
