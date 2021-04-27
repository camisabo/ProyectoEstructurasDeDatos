package implementacionesED;
import java.util.*;

public class arrayStack<T> implements Stack<T> {
	private int top;
	private T[] stck;
	private int size;
	
	public arrayStack(int initialCap) {
		
		if(initialCap<1) {
			throw new IllegalArgumentException("Initial Capacity must be at least 1");
		}
		this.stck = (T[]) new Object[initialCap];
		this.top = -1;
	}
	
	public arrayStack() {
		this(10);
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void push(T element) {
		int cap =  2 * stck.length;
		if(this.size == stck.length - 1 ) {
			T[] olds = stck;
			stck = (T[]) new Object[cap];
			
			for(int i = 0; i < this.size-1 ; i++) {
				stck[i] = olds[i];
			}
		olds = stck;
		}
	stck[++top] = element;
	size++;
	}
	
	public T pop() {
		if(isEmpty())
			throw new EmptyStackException();
			
		T popElement =  stck[top];
		stck[top--] = null;
		size--;
	return popElement;
	}
	
	public T top(){
		if(isEmpty()) {
			throw new EmptyStackException();
		}
	return stck[top];
	}
	
}
