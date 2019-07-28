import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner x = new Scanner(System.in);
	    
	    int[] input = new int[5];
	    int[] even = new int[5];
	    int sum = 0;
	    
	    for(int i = 1; i<6; i++){
	        System.out.print("Enter Number Here : ");
	        input[i-1] = x.nextInt();
	    }
	    for(int j = 1; j<6; j++){
	        if(input[j-1]%2==0){
	            even[j-1] = input[j-1];
	        }
	    }
	    for(int m = 1; m<6; m++){
	        sum = sum + even[m-1];
	    }
	    System.out.println("");
	    System.out.println("The Sum of the Entered Even Values is : ");
	    System.out.println(sum);
	}
}
