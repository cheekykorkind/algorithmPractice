package shortestPathAlgorithm;
import shortestPathAlgorithm.Vertex;

	/*
	 * Dijkstra shortest path algorithm�� ���� ��ķ� �����ߴ�.
	 * 1. ����ġ�� ����� weight[MAX_VERTICES][MAX_VERTICES]�� �����Ѵ�.
	 * 2. ������ ������ vertices[MAX_VERTICES]�� �����Ѵ�.
	 * 4. weight�� �����ϰ��� �ϴ� �׷����� ����ġ�� �ʱ�ȭ �Ѵ�.
	 * 5. ���� ������ �����Ѵ�.
	 * 6. vertices[].distance���� ���� ������ ���� weight�� �ʱ�ȭ �Ѵ�.
	 * 7. �ִ� �Ÿ� ������ �߰��� ������ ã�´�.
	 *  7-1 vertices[].found�� false�̰� vertices[].distance�� ���Ѵ�(���� ������ �ƴ϶�¶�)�� �ƴ� ������ �߿���
	 *  7-2 vertices[].distance�� ���� ���� ������ ����.
	 *  7-3 ���õ� ������ vertices[].found�� true�� �����Ѵ�.
	 * 8. �ִ� �Ÿ� �������� �߰����� ���� ������ vertices[].distance�� �����ؾ� �Ѵ�.
	 *  8-1 vertices[].found�� false�� ��������
	 *  8-2 ���� �߰��� �ִ� �Ÿ� ������ distance + ���� �߰��� �ִ� �Ÿ� ������ �� �߰��� ������ weight ���̿� �� �߰��� ������ distance�� ���ؼ� ª���ɷ� �����Ѵ�.
	 *     �ڵ�� ǥ���ϸ� bigest(vertices[].sequence).distance + , 
	 * 
	 * 
	 * etc1. �� ������ ���� ������ �ִ� �Ÿ��� Vertex.distace�� ���� �� ���̴�.
	 * etc2. Vertex.found�� true�� ǥ���ؼ� �ش� ������ �ִ� �Ÿ� ������ ���տ� �߰��Ǿ����� ǥ���Ѵ�.
	 * etc3. �ش� ������ �ִ� �Ÿ� ������ ���տ� �߰��� ������ Vertex.sequence�� int���� �������Ѽ� �ݿ��Ѵ�.	  
	 */


public class DijkstraAlgorithm {
	public DijkstraAlgorithm(){
		Vertex[] vertices = new Vertex[7];
		
	}
}
