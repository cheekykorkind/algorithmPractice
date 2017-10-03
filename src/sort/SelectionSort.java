package sort;
/*
 * 1. 오름차순으로 정렬한다.
 * 2. 첫번째 원소부터 n번째 원소를 비교하면서 작은쪽의 index를 기록한다.
 * 3. data를 1 순회하면 2 순회는 두번째 원소부터 순회를 시작한다.
 * 4. data를 2 순회하면 3 순회는 세번쨰 원소부터 순회한다.
 * 5. 3.과 4.를 data의 마지막 원소까지 계속한다.
 * 데이터 : [9,1,6,8,4,3,2,0] 
 */
public class SelectionSort {
	private int[] _data;
	public SelectionSort(int[] unsortedData){
		this._data = unsortedData;
		this.sort();
	}
	
	private void sort(){
		int currentMinimum, temp;
		for(int i = 0; i < _data.length-1; i++){	//	data를 전부 순회한다.
			currentMinimum = i;	//	data를 i번째 순회이후의 i+1번째 순회의 시작 원소의 위치는 i+1번째 이다.
			for(int n = i+1; n < _data.length-1; n++){
				if(_data[n] < _data[currentMinimum]){	//	작은 원소를 발견하면 index를 기록한다.
					currentMinimum = n;
				}
			}
			// 가장 작은 원소를 가장 왼쪽으로 옮긴다.
			temp = _data[i];
			_data[i] = _data[currentMinimum];
			_data[currentMinimum] = temp;
			System.out.print(_data[i] + " ");
		}
	}
}
