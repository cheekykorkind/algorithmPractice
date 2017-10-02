package testingPlace;

public class AdjacentListGraph {
	int size;
	List[] adJacentList;
	
	public AdjacentListGraph(String[] arguments){
		this.size = arguments.length;
		this.adJacentList = new List[size];
		for(int i = 0; i < size; i++){
			this.adJacentList[i] = new List(arguments[i]);
		}
	}
	
	public void add(String vertex, String newAdjacent){
		this.adJacentList[findIndex(vertex)].add(findIndex(newAdjacent));
//		this.adJacentList[findIndex(newAdjacent)].add(findIndex(vertex));
	}
	public int findIndex(String vertex){
		for(int i = 0; i < this.size; i++){
			if(adJacentList[i].vertext.equals(vertex)){
				return i;
			}
		}
		return -1;
	}
	
	
	private class List{
		String vertext;
		Node edges;
		
		public List(String argument){
			this.vertext = argument;
		}
		public void add(int index){
			edges = new Node(index, edges);
		}
		// 처음엔 null, 두번째 node를 생성하면서 처음의 주소를 next에 저장하고 start부분을 덮어씌운다.
		// 세번째 node를 생성하면서 두번째 node주소를 next에 저장하고 start를 덮어씌운다.
		// List.edges는 가장 마지막에 생성된 node를 가리킨다.
		// 순회방법은 List.edges == 세번째 node
		// List.edges.next == 두번째 node
		// List.edges.next.next == 첫번째 node
		// 오오 역순회네?
		private class Node{
			int nodeIndex;
			Node next;
			
			public Node(int nodeIndex, Node next){
				this.nodeIndex = nodeIndex;
				this.next = next;
			}
		}	//	End of Node class
	}	//	 End of List class
}	//	End of AdjacentListGraph
