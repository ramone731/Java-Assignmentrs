package Assignments;

public class AssignmentJava_4 {

    public static void main(String[] args) {
        
    // Print the number of characters of a given string
	public static void printCharNumInString(String s) {
		java.util.Map<Character, Integer> count = new java.util.HashMap<Character, Integer>();
		
        //Declares int varuable "n" with the amount of characters
        int n = s.length();
		
        //For loop implementation + if else statement determing the amount of keys
        for(int i=0; i<n; i++) {
			if(!count.containsKey(s.charAt(i))) {
				count.put(s.charAt(i), 1);
			}else {
				count.replace(s.charAt(i), count.get(s.charAt(i))+1);
			}
		}
		
        //Count function of K and V variables
		count.forEach((k,v) -> {
			System.out.print(k+" occurs "+v+ " time");
			if(v>1) System.out.print("s");
			System.out.println();
		});
	}
	
    
    //Void class  storing  function to askthe user to enter a string
	public static void execute() {
		
        System.out.print("Enter a string: ");

		java.util.Scanner in = new java.util.Scanner(System.in);
		
        String phrase = in.next();
		
        printCharNumInString(phrase);
		
	}

            
            
        
    
    
}




