package shortestPathAlgorithm;

public class Vertex {
	private String name;
	private int distance;
	private boolean found;
	private int sequence;
	
	public Vertex(){}
	public Vertex(String name, int distance){
		this.name = name;
		this.distance = distance;
		this.found = false;
		this.sequence = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public boolean isFound() {
		return found;
	}
	public void setFound(boolean found) {
		this.found = found;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	
}
