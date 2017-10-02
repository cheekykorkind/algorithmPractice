package testingPlace;

public class AdjacentMatrixGraph{
	String vertexLabel[];
	boolean adjacencyMatrix[][];
	
	public AdjacentMatrixGraph(String[] arguments){
		this.vertexLabel = arguments;
		this.adjacencyMatrix = new boolean[arguments.length][arguments.length];
		initializeAdjacencyMatrix();
	}
	
	public void add(String vertex, String newAdjacency){
		// adjacencyMatrix에서 적용할 위치를 찾기위해서 파라미터의 index를 찾아야 한다.
		// 찾아낸 index로 adjacencyMatrix를 true로 바꾼다.
		int row, column;
		row  = findIndex(vertex);
		column = findIndex(newAdjacency);
		
		if(row == -1 || column == -1){
			System.out.println("존재하지 않는 vertex 입니다. add() 실행하지 않습니다.");
			return;
		}
		
		this.adjacencyMatrix[row][column] = true;
		this.adjacencyMatrix[column][row] = true;
		
	}
	
	private int findIndex(String vertex){
		int size = this.adjacencyMatrix.length;
		for(int i = 0; i < size; i++){
			if(this.vertexLabel[i].equals(vertex)){
				return i;
			}
		}
		return -1;	//	존재하지 않음.
	}
	

	public void initializeAdjacencyMatrix(){
		int size = this.adjacencyMatrix.length;
		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){
				this.adjacencyMatrix[i][j]=false;	
			}
		}
	}
	
	public void printVertex(){
		// a의 인접 vertex는 어떻게 판별하나? matrix의 true값 인듯
		int size = this.adjacencyMatrix.length;
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < size; i++){
			buffer.append(this.vertexLabel[i] + " : ");
			for(int j = 0; j < size; j++){
				if(this.adjacencyMatrix[i][j] == true){
					buffer.append(this.vertexLabel[j]);
				}
			}
			buffer.append("\n");
		}
		System.out.println(buffer);
	}
	
	
	public void printMatrix(){
		int size = this.adjacencyMatrix.length;
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < size; i++){
			buffer.append((i+1)+" row : ");
			for(int j = 0; j < size; j++){
				buffer.append(String.valueOf(this.adjacencyMatrix[i][j]) + " ");	
			}
			buffer.append("\n");
		}
		System.out.println(buffer);
	}
}	//	End of AdjacentMatrixGraph class