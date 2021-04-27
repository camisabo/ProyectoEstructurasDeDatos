package implementacionesED;

import java.util.EmptyStackException;

public class linkedList<T> {
	private int size;
	private Node<T> head = null;
	private Node<T> tail = null;
	
	public linkedList() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}
	
	public int size() {
	return size;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public void addFront(T dataIn) {
		Node<T> n = new Node<T>(dataIn);
		
		if(isEmpty()) {
			this.head = this.tail = n; //lista unitaria
			this.size++;
		}else{
			n.next = this.head;
			this.head = n;
			this.size++;
		}	
	}
	
	public void addEnd(T dataIn) {

		Node<T> n = new Node<T>(dataIn);
		
		
		if(isEmpty()) {
			this.head = this.tail = n;   //lista unitaria
			this.size++;
		}else {
			this.tail.next = n;
			this.tail = n;
			this.size++;
		}	
	}

	public void addAfter(Node<T> node, T element) {
		Node<T> n =  new Node<T>(element);
		n.next = node.next;
		node.next = n;
		
		if(this.tail == node) {
			this.tail = n;
		}
	}
	
	public void removeFront() {
		
		//si está vacía
		if(isEmpty()) {
		throw new EmptyStackException();
		}
		//si es unitaria
		if(this.head == this.tail) {
			this.head = this.tail = null;
		}else {
			this.head = this.head.next;
			this.size--;
		}
	}
	
	public void removeEnd() {
		
		//si está vacía
		if(isEmpty()){
			throw new EmptyStackException();
		}
		
		//si es unitaria
		if(this.head == this.tail) {
			this.head = this.tail = null;
			this.size--;
		}else {
			Node<T> aux = this.head;
			//Recorrer lista hasta penúltima
			while(aux.next.next != null) {
				aux = aux.next;
			}
			//Eliminar última posición
			aux.next = null;
			this.tail = aux;
			this.size--;
		}
	}
	
	public T frontElement() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
	return this.head.data;
	}
	
	public T endElement() {
		Node<T> aux = this.head;
		Node<T> ret = null;
	
		if(isEmpty()) {
			throw new EmptyStackException();
		}else{
			while(aux != null) {
				ret = aux;
				aux = aux.next;
			}
		}
	return ret.data;
	}
	
	public boolean findElement(T element) {
		Node<T> aux = this.head;
		boolean equal = false;
		//Recorrer lista
		while(aux != null){
			//Comparar y encontrar
			if(element == aux.data) {
				equal = true;
				break;
			}
		aux = aux.next;
		}
	return equal;
	}
	
	public Node<T> returnElement(T dataIn){
		Node<T> retNode = null;
		Node<T> aux = this.head;
	
		//Recorrer lista
		while(aux != null) {
			//Comparar y encontrar
			if(aux.data == dataIn) {
				retNode = aux;
				break;
			}
		aux = aux.next;
		}
		//Si no existe
		if(aux.data != dataIn) {
			return null;
		}
	return retNode;
	}

	public void printList() {
		//Si está vacía
		if(isEmpty()){
			throw new EmptyStackException();
		}
		
		Node<T> node = this.head;
		int pos=1;
		while(node != null) {
			System.out.println(pos + ": "+ node.data);
			node = node.next;
			pos++;
		}
	}
	
	
}
