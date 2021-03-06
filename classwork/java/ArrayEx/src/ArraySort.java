//program to sort the array 
import java.util.Scanner;

public class ArraySort {    
    public static void main(String[] args) {        
            
        //
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the array size");
    	int size=sc.nextInt();
    	int[] arr = new int[size];
    	System.out.println("Enter the elements to sort");
    	for (int i = 0; i < arr.length; i++) {     
            arr[i]=sc.nextInt();    
        }    
    	int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    