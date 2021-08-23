package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
    String text1 = "stops";
    String text2 = "potss";
    int count=0;
    int length = text1.length();
    int length1 = text2.length();
    if (length == length1) {
    	char[] charArray1 = text1.toCharArray();
    	char[] charArray2 = text2.toCharArray();
    	Arrays.sort(charArray1);
    	Arrays.sort(charArray2);
    	for(int i=0;i<charArray2.length;i++) {
    		if(charArray1[i]==charArray2[i]) {
    			count=count+1;
    		}
    		
    	}
    	if(count==charArray1.length) {
    		System.out.println("Each letter matches");
    	}
    }
	}

}
