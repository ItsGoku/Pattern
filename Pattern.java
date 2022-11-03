import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter first string:");
		
		String str1= sc.nextLine();
		
		System.out.println("Please enter second string:");
		
		String str2= sc.nextLine();
		
		String enb = null;
		
		String enk = null;
		
		if(str2.length() > str1.length()) {
			
			enb = str2;
			enk = str1;
			
		}
		else {
			
			enb = str1;
			enk = str2;
			
	 	}
		
		System.out.println(" "+enb);
		
		char[] arrenb = enb.toCharArray();
		
		char[] arrenk = enk.toCharArray();
		
		for (int i = 0; i<arrenk.length; i++) {

			
			if (arrenb[i]==arrenk[i]) {
				
				System.out.println(arrenk[i]+" ".repeat(i)+"+");
				
			}
			else {
				
				System.out.println(arrenk[i]+" ".repeat(i)+"-");
				
			}
		}
	
	}


}
