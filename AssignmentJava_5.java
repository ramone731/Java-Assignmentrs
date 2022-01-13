package Assignments;
import java.util.Scanner;

//===========================================================================
//Java Assignment - 5
// 
//Scanner program that ask the user for the product they are and searching for
//that disaplays the avaible values that are in stock 
//An implementation of an if statement that displays an output of non-avaiable items
//===========================================================================


public class AssignmentJava_5 {
    

	public static void main(String[] args) {
		
        //Create scanner function for taking input
		Scanner sc = new Scanner (System.in);
			
		//Display an out asking the user to enter name of product
        System.out.println("Enter the Product which you are looking?");
		
		String input = sc.next();
				
		boolean exist = false;
		
        //String implmentatino with an list of 5 elements 
		String[] list = {"Laptop", "Television", "Desktop", "Phone", "Keyboard"};
        
        //For loop  contruct  that list the available of amount of quantity of the product
		for(int x = 0; x < list.length; x++)
		{
			if(list[x].equals(input))
			{
				exist = true;
 				System.out.println(list[x] + " is available in " + x + " Position");
			}
		}

        //If statement to tell the user if the product is available
		if(exist == false)
		{
			System.err.println("Error: Product is not exist.");
		}

		sc.close();
	}
}


