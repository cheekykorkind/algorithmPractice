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
		// ó���� null, �ι�° node�� �����ϸ鼭 ó���� �ּҸ� next�� �����ϰ� start�κ��� ������.
		// ����° node�� �����ϸ鼭 �ι�° node�ּҸ� next�� �����ϰ� start�� ������.
		// List.edges�� ���� �������� ������ node�� ����Ų��.
		// ��ȸ����� List.edges == ����° node
		// List.edges.next == �ι�° node
		// List.edges.next.next == ù��° node
		// ���� ����ȸ��?
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
