package testingPlace;

public class ReverseLinkedList {
	String value;
	int size;
	ReverseLinkedList previous;
	
	public ReverseLinkedList(String value, ReverseLinkedList previous){
		this.value = value;
		this.previous = previous;
	}
	
	public void add(String value){
		this.previous = new ReverseLinkedList(value, this.previous);
	}
	
	public void printList(){
		StringBuffer buffer = new StringBuffer();
		
		buffer.append("value is "+ this.value + "\n");
		for(ReverseLinkedList i = new ReverseLinkedList("",this.previous); i.previous != null; i.previous = i.previous.previous){
			buffer.append("value is "+ i.previous.value + "\n");	
		}
		System.out.println(buffer);
	}
	
}	//	End of ReverseLinkedList class
