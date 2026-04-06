package MyPackage;
import java.util.*;
public class romano_562606 {
	public static void main (String[] args) {

		int numbers [][] =  {{120,250,789,7},{58,79,31,87},{8,1,2,3},{99,98,97,96}};
		for (int j =0; j <numbers.length; j++) {
			for (int f =0; f <numbers[j].length; f++) {
				System.out.print(numbers[j][f] +" ");
				
				}System.out.println(" ");
			}
			

	    for (int j =0; j <numbers.length; j++) {
	    	for (int f =0; f <numbers[j].length; f++) {
	    		if (numbers[j][f] == 1) {
					System.out.println("Number 1 is found at indices " + j + " and " + f);
					numbers [j] [f] = 50;
	    		}
					
	    		}System.out.println(" ");
	    	}
	    	
	    
	    for (int j =0; j <numbers.length; j++) {
			for (int f =0; f <numbers[j].length; f++) {
				System.out.print(numbers[j][f] +" ");
				
				}System.out.println(" ");
			}
	    
	    for (int f = 0; f < numbers[2].length; f++) {
	    	numbers [2][f] = 0;
	    }
	    
	    for (int j =0; j <numbers.length; j++) {
			for (int f =0; f <numbers[j].length; f++) {
				System.out.print(numbers[j][f] +" ");
				
				}System.out.println(" ");
			}
	    
	}
}
