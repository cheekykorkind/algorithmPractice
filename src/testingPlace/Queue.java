//package testingPlace;
//
//public class Queue {
//	int size;
//	Node header;
//	Node next;
//	
//	public Queue(){
//		this.size = 0;
//	}
//	public void push(String value){
//		if(this.next == null){
//			this.next = new Node(value);
//			this.header = this.next;
//		}else{
//			Node temp = this.next; 
//			temp.next = new Node(value);
//		}
//		
//		this.size++;
//	}
//	public Node pop(){	//	항상 맨 앞의 Node를 꺼낸다.
//		Node target = this.header;
//		Node second = target.next;
//		this.header = second;
//		
//		this.size--;
//		return target;
//	}
//	public Node getNode(int index){
//		
//	}
//	public int getIndex(Node n){
//		
//	}
//}
//
//class Node{
//	String value;
//	Node next;
//	public Node(){
//		
//	}
//	public Node(String value){
//		this.value = value;
//		this.next = null;
//	}
//}