import java.util.Scanner;

public class MiddleString {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three Strings ");
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		String str3 = input.nextLine();
		
		int ab = 0;
		int bc = 0;
		int ac = 0;
		
		while(str1.charAt(ab) == str2.charAt(ab));{
			ab++;
		}
		
		while(str1.charAt(ac) == str3.charAt(ac)); {
			ac++;
		}
		
		while(str2.charAt(bc) == str3.charAt(bc)); {
			bc++;
		}
		
		
		if (str1.charAt(ab) > str2.charAt(ab)){
			if (str1.charAt(ac) > str3.charAt(ac)){
				System.out.println(str3);
			}
			else if(str1.charAt(ac) < str3.charAt(ac)){
				System.out.println(str1);
			}
		}
		else if (str1.charAt(ab) < str2.charAt(ab)) {
			if (str2.charAt(bc) > str3.charAt(bc)){
				System.out.println(str3);
			}
			else if (str2.charAt(bc) < str3.charAt(bc)) {
				System.out.println(str2);
			}
			
		}
		
	}
}