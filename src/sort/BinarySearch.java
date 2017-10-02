package sort;


// 오름차순으로 정렬된 데이터가 있다.
// 가장 큰 값과 가장 작은 값과 중간값을 구한다.
// input값과 중간값이 일치하는지 비교한다.
// input값이 중간값보다 크면 high와 low의 범위를 middle의 오른쪽 범위로 수정한다.
// 반복한다.
// 끝내는 조건은?
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
			} else if(value > binaryDatas[middle]){	//	low와 high를 오른쪽 범위로 수정한다.
				low = middle + 1;
			} else if(value < binaryDatas[middle]){	//	low와 high를 왼쪽 범위로 수정한다.
				high = middle -1;
			}
		}
		
	}
}