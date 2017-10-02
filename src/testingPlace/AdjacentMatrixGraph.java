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
		// adjacencyMatrix���� ������ ��ġ�� ã�����ؼ� �Ķ������ index�� ã�ƾ� �Ѵ�.
		// ã�Ƴ� index�� adjacencyMatrix�� true�� �ٲ۴�.
		int row, column;
		row  = findIndex(vertex);
		column = findIndex(newAdjacency);
		
		if(row == -1 || column == -1){
			System.out.println("�������� �ʴ� vertex �Դϴ�. add() �������� �ʽ��ϴ�.");
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
		return -1;	//	�������� ����.
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
		// a�� ���� vertex�� ��� �Ǻ��ϳ�? matrix�� true�� �ε�
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