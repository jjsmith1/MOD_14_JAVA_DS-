import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class arrayhomework {

	public static int[] toPower(int size,int power) {
		int [] array= new int[size];
		for(int i=0;i<size;i++)
			array[i]=(int)(Math.pow(i,power));
		return array;
		
	
		
	}
	public static int sumAll(int[] values) {
		 int sum = 0;
		for(int i=0; i < values.length; i++) {
			 sum+=values[i];		
		}
		return sum;
	}
	public static void main(String[] args) {
		
		
		int[] testArray= {1,5,4}; 
		int result= sumAll(testArray);
		System.out.println(result);
		
		int[] myVariable=toPower(4,2);
		for(int i=0;i< myVariable.length;i++) {
			System.out.println(myVariable[i]);
		}
			
		
		
		
	}
}	