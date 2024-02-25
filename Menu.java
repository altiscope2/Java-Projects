package shapemenu;
import java.util.Scanner;
//Here are following requirements to completing Menu shapes:

//1. Create menu that have 4 options 
//  1. Filled Triangle  
// 2. Filled Inverted Triangle
//3. This can be any shape such as a Square, circle, a different angle of the triangle...etc
//4. (This option is extra credit create a Bow Tie shape an image of it is at the bottom)
// 4. Exit (This Exit will be 5 if you wanting to do the extra credit)
public class Menu {


//option 1 Filled triangle
	  
	    public static void pyramidPattern(int n) 
	    {  
	        for (int i=0; i<n; i++) //outer loop for number of rows(n)
	        { 
	        for (int j=n-i; j>1; j--) //inner loop for spaces
	            { 
	                System.out.print(" "); //print space
	            }  
	            for (int j=0; j<=i; j++ ) //inner loop for number of columns
	            { 
	                System.out.print("* "); //print star
	            } 
	  
	            System.out.println(); //ending line after each row
	        } 
	    } 
	  
	    public static void main(String args[]) //driver function
	    { 
	        int n = 5; 
	        pyramidPattern(n); 

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows: ");
 
	        int rows = sc.nextInt();        
	        for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
   // sc.close();
 
}

}

