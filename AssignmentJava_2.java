package Assignments;
import java.util.Scanner;

//===========================================================================
//Java Assignment - 2
//Print the count of vowels and Non-voewls 
//===========================================================================

public class AssignmentJava_2 {

    public static void main(String[] args) {

        //Implement scanner method to take input from user
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an vowel of the Alphabet: ");

        String s = in.nextLine();

        //Store the amount of vowels in the array
        int[] counts = new int[5];

        //Convert int to char 
        String[] mapping = {"a", "e", "i", "o", "u"};

        
        //Implement a for-loop with a switch statement
        for (int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                //Case value 'a' <= 0
                case'a':counts[0]++;break;
                case'A':counts[0]++;break;
                
                //Case value 'e' <= 1
                case'E':counts[1]++;break;
                case'e':counts[1]++;break;
                
                //Case value 'i' <= 2
                case'I':counts[2]++;break;
                case'i':counts[2]++;break;
                
                //Case value 'o' <= 3
                case'O':counts[3]++;break;
                case'o':counts[3]++;break;
                
                //Case value 'u' <= 4
                case'U':counts[4]++;break;
                case'u':counts[4]++;break;
                

            }
        }
        
        boolean flag = false;

        for(int i = 0; i < 5; i++)
        {
            if(counts [i] > 0)
            {
                //Print the count value
                System.out.println(mapping[i] + ":" + counts[i]);

                //True of False variable
                flag = true;
            }
        }
        if(!flag)
    {
        //Incase no vowels are detected, out statement
        System.out.println("There are no vowels");
    }
    
}  

}
