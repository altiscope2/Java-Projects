//Create an aENum for months of the year. 
//Create a function with the user input.
//Also in that function have a switch statement and a message for each month
//find a way to implement either a try/catch or a throw in that function
//user input will be in the main function
package inClassLab;
import java.io.IOException;
import java.util.Scanner;

 enum Year {
		 JANUARY,
		 FEBRUARY,
		 MARCH,
		 APRIL,
		 MAY,
		 JUNE,
		 JULY,
		 AUGUST,
		 SEPTEMBER,
		 OCTOBER,
		 NOVEMBER,
		 DECEMBER;
	}
	


public class InclassLab {
	Year year;
 
	public InclassLab(Year year)
	{ this.year= year;}
	
//main with input
public static void main(String[] args) {

			 Scanner myObj = new Scanner(System.in);
			 System.out.println(" Please input a month:");
			 String str= myObj.nextLine();
			 
			 InclassLab test =new InclassLab(Year.valueOf(str));
			
			
			 test.monthsofyear();
			 myObj.close();
			 }	 	 	



 //output for months  
public void monthsofyear() {
try {
 switch(year) {
 	case JANUARY:
 	System.out.println("January is cold");
 	break;
 	
 	case FEBRUARY:
 	 	 System.out.println("Feburary is also cold");
 	 	 	break;
 	case MARCH:
 	 	 System.out.println("March still winter");
 	 	 	break;
 	case APRIL:
 	 	 System.out.println("April is spring");
 	 	 	break;
 	case MAY:
 	 	 System.out.println("May getting warmer");
 	 	 	break;
 	case JUNE:
 	 	 System.out.println("JUNE is officially summer");
 	 	 	break;
 	case JULY:
 	 	 System.out.println("july summer");
 	 	 	break;
 	case AUGUST:
 		System.out.println("AUGUST");
 		break;
 	case SEPTEMBER:
 		System.out.println("SEPTEMBER");
 		break;
 	case OCTOBER:
 		System.out.println("OCTOBER HAS HALLOWEEN");
 		break;
 	case NOVEMBER:
 		System.out.println("NOVEMBER IS COLD");
 		break;
 	case DECEMBER:
 		System.out.println("DECEMBER HAS CHRISTMAS");
 		break;
 	
 		
 }
}   catch(IllegalArguementException e) {
	
	System.out.println("Error please enter again");
}
}
}

