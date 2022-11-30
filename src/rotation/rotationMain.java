package rotation;

import java.util.Scanner;

public class rotationMain {

	static boolean checkString(String a, String b) {
		if (a.length()!=b.length()) {
			return false;
		}
		int startingIndexofB = b.indexOf(a.charAt(0));
		if (startingIndexofB==-1) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt((i + startingIndexofB) % b.length())) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner sc= new Scanner(System.in); 
		System.out.println("veuillez saisir la première chaîne");
		String a = sc.nextLine();  
		System.out.println("veuillez saisir la deuxième chaîne");
		String b = sc.nextLine();  
		
		System.out.println(checkString(a,b));
	}

}
