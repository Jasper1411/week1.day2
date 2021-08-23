package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		//Here is the input
     String test = "Welcome to Class of Automation";
     char[] test2 = test.toCharArray();
     // Here is what the count you need to find
     int letter = 0, space = 0, num = 0, specialChar = 0;
     
     //Build the logic to find count of each
     for (int i = 0; i< test2.length; i++) {
    	 if (Character.isLetter(test2[i])) {
        	 letter = letter + 1;}
    	 else if (Character.isDigit(test2[i])) {
    		 num = num + 1;
    	 }
    	 else if (Character.isSpaceChar(test2[i])) {
    		 space = space + 1;
    	 }
    	 else {
    		 specialChar = specialChar + 1;
    	 }
     }
     //Print the count here
     System.out.println("letter: " + letter);
     System.out.println("space: " + space);
     System.out.println("number: " + num);
     System.out.println("specialCharacter: " + specialChar);
     
	}

}
