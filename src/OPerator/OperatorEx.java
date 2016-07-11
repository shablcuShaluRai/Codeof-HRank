package OPerator;

import java.util.*;

public class OperatorEx {
	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	      //  System.out.println("Enter the cost of meal");
	        double mealCost = scan.nextDouble(); // original meal price
	        //System.out.println("Enter the percentage of tips");
	        int tipPercent = scan.nextInt(); // tip percentage
	        //System.out.println("Enter the percentage of tax");
	        int taxPercent = scan.nextInt(); // tax percentage
	        scan.close();
	      
	        // Write your calculation code here.
	         double tip=(mealCost*tipPercent)/100;
	        double tax=(mealCost*taxPercent)/100;
	        double cost=mealCost+tip+tax;
	      
	        // cast the result of the rounding operation to an int and save it as totalCost 
	        int totalCost = (int) Math.round(cost);      
	        // Print your result
	        System.out.println("The total meal cost is "+totalCost+" dollars.");
	    }
	}
	


