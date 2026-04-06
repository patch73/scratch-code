package MyPackage;
import java.util.*;
public class romano_562606 {
	public static void main (String[] args) {
////		datatype id [] = new datatype [size];
//		
		Scanner s = new Scanner (System.in);
//				
//		String [] names = new String [2]; 
//		
//		for (int i = 0; i < names.length; i++) {
//			names [i] = s.nextLine();
//		}
//		
//		for (String name : names) {
//			System.out.println(name);
//		}
		
//		int [][] array = new int [4][3];
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int x=0; x < array[i].length; x++) {
//				System.out.println("Enter number: ");
//				array [i][x] = s.nextInt();
//			}
//		}
//		
//		for (int j =0; j <array.length; j++) {
//			for (int f =0; f <array[j].length; f++) {
//				System.out.print(array[j][f] +" ");
//			}
//			System.out.println(" ");
//		}
		
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
