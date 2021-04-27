package implementacionesED;

public class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
	
	public Node(Node<T> next) {
		this.next = next;
	}
	
	public Node(T element, Node<T> head){
		this.data = element;
		this.next = head;
	}
}
