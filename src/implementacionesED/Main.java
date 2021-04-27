package implementacionesED;
import java.time.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	
	linkedList<Integer> myLL = new linkedList<>();
	linkedStack<Integer> myLS = new linkedStack<>();
	arrayStack<Integer> aS = new arrayStack<>();
	
	long startTime1 = System.nanoTime();
    for (int a =0; a<100 ; a++){
    myLL.addFront(a);
    }
    long endTime1 = System.nanoTime();
    long timeTot1 = endTime1 - startTime1;
    System.out.println("Execution time in nanoseconds: " + timeTot1);
    
    long startTime2 = System.nanoTime();
    for (int a =0; a<100 ; a++){
        myLS.push(a);;
        }
        long endTime2 = System.nanoTime();
        long timeTot2 = endTime2 - startTime2;
        System.out.println("Execution time in nanoseconds: " + timeTot2);
	
	long startTime3 = System.nanoTime();
    for (int a =0; a<100 ; a++){
        myLS.pop();
        }
        long endTime3 = System.nanoTime();
        long timeTot3 = endTime3 - startTime3;
        System.out.println("Execution time in nanoseconds: " + timeTot3);
	
	long startTime4 = System.nanoTime();
    for (int a =0; a<100 ; a++){
        aS.push(a);
        }
        long endTime4 = System.nanoTime();
        long timeTot4 = endTime4 - startTime4;
        System.out.println("Execution time in nanoseconds: " + timeTot4);
	}
}