package implementacionesED;
import java.util.EmptyStackException;

public class linkedStack<T> implements Stack<T>{
	private int size;
	private Node<T> top;
	
	public linkedStack() {
		top = null;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return this.top == null;
	}
	
	public T top() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
	return this.top.data;
	}

	public void push(T dataIn) {
		Node<T> newNode =  new Node<T>(dataIn);
		//Nuevo dato en top
		newNode.next = this.top; //desplazar top anterior
		size++;
		this.top = newNode; 	//asigna dato a top
	}
	
	public T pop() {
		T popData;
		if(isEmpty()) {
			throw new EmptyStackException( );
		}
		popData = this.top.data;
		this.top = this.top.next;
		size--;
	return popData;
	}

	
	
}
