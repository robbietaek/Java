package chap6;

import java.util.Scanner;

public class homework {

	  public static void main(String[] args) {

		   //a,b,c ... z
		   char[] abcCode = 
		    { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*','(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
		   
		   // 0 1 2 3 4 5 6 7 8 9
		   char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		   System.out.println("소문자영 숫자로 이루어진 문자열을 입력하세요");
		   Scanner scan = new Scanner(System.in);
		   String src = scan.next();
		   System.out.println("src:" + src);


		   
		   int total = src.length();
		   char[] all = new char[total];
		   
		   for(int i=0; i<total;i++) {
		    all[i] = src.charAt(i);
		   }
		   
		   char[] abc = new char[abcCode.length]; 
		   for(int i=0;i<abcCode.length;i++) {
		    abc[i] = (char)(i+'a');
		   }
		   
		   char[] num = new char[numCode.length]; 
		   for(int i=0;i<numCode.length;i++) {
		    num[i] = (char)(i+'0');
		   }
		   
		   
		   System.out.print("result:");
		   
		   for(int i=0; i<total; i++) {
		    
		    for(int j=0; j<abc.length;j++) {
		     if(all[i]==abc[j]) {
		      System.out.print(abcCode[j]);
		     }
		    }
		    
		    for(int k=0; k<num.length;k++) {
		     if(all[i]==num[k]) {
		      System.out.print(numCode[k]);
		     }
		    }
		    }
		  }
	  	
 }



 


