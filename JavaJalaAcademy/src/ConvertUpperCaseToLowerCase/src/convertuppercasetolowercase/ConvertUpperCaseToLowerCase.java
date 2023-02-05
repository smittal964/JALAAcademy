
package convertuppercasetolowercase;

import java.util.Scanner;
public class ConvertUpperCaseToLowerCase {

 private static Scanner sc;  
    public static void main(String[] args) {
        String uppStr;
		int i;
		
		sc= new Scanner(System.in);

		System.out.println("Please Enter Uppercase String =  ");
		uppStr = sc.nextLine();
		
		char[] upch = uppStr.toCharArray();
		
		for(i = 0; i < upch.length; i++)
		{
			if(upch[i] >= 'A' && upch[i] <= 'Z') {
				upch[i] = (char) ((int)upch[i] + 32);;
			}
		}
		System.out.println("The Lowercase String  =  ");
		for(i = 0; i < upch.length; i++) {
			System.out.print(upch[i]);
		}
        
    }
    
}
