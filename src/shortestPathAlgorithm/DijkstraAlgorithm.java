package shortestPathAlgorithm;
import shortestPathAlgorithm.Vertex;

	/*
	 * Dijkstra shortest path algorithm을 인접 행렬로 구현했다.
	 * 1. 가중치를 기록한 weight[MAX_VERTICES][MAX_VERTICES]를 생성한다.
	 * 2. 정점의 집합인 vertices[MAX_VERTICES]를 생성한다.
	 * 4. weight를 적용하고자 하는 그래프의 가중치로 초기화 한다.
	 * 5. 시작 정점을 설정한다.
	 * 6. vertices[].distance들을 시작 정점의 관련 weight로 초기화 한다.
	 * 7. 최단 거리 정점에 추가될 정점을 찾는다.
	 *  7-1 vertices[].found가 false이고 vertices[].distance가 무한대(인접 정점이 아니라는뜻)이 아닌 정점들 중에서
	 *  7-2 vertices[].distance가 가장 작은 정점을 고른다.
	 *  7-3 선택된 정점의 vertices[].found를 true로 갱신한다.
	 * 8. 최단 거리 정점으로 추가되지 않은 정점은 vertices[].distance를 갱신해야 한다.
	 *  8-1 vertices[].found가 false인 정점들을
	 *  8-2 새로 추가된 최단 거리 정점의 distance + 새로 추가된 최단 거리 정점과 안 추가된 정점의 weight 길이와 안 추가된 정점의 distance를 비교해서 짧은걸로 갱신한다.
	 *     코드로 표현하면 bigest(vertices[].sequence).distance + , 
	 * 
	 * 
	 * etc1. 각 정점과 시작 정점의 최단 거리는 Vertex.distace에 저장 될 것이다.
	 * etc2. Vertex.found에 true로 표시해서 해당 정점이 최단 거리 정점의 집합에 추가되었음을 표시한다.
	 * etc3. 해당 정점이 최단 거리 정점의 집합에 추가된 순서를 Vertex.sequence에 int값을 증가시켜서 반영한다.	  
	 */


public class DijkstraAlgorithm {
	public DijkstraAlgorithm(){
		Vertex[] vertices = new Vertex[7];
		
	}
}
