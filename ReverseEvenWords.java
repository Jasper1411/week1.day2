package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
         String test="I am a software tester";
         String[] splitStr = test.split(" ");
         String odd= "";
         String even= "";
         for (int i=0;i<splitStr.length;i++) {
        	 if (i%2!=0) {
        		 char[] charStr=splitStr[i].toCharArray();
        		 for (int j=charStr.length-1;j>=0;j--) {
        			 odd=odd+charStr[j];
        		 }
        		 odd=odd.concat(" ");
        		 even=odd;
        	 }
        	 else {
        		 even=even+splitStr[i].concat(" ");
        		 odd=even;
        	 }
         }
         System.out.println(even);
     }

}
