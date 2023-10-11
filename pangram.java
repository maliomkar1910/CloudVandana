
import java.util.*;

public class pangram {

	static boolean checkPangram(String str) {
		
		Set<Character> arr = new HashSet<>();
        char []a=str.toCharArray();
		for (char ch : a) {
			
			if (ch >= 'a' && ch <= 'z')
				arr.add(ch);

			
			if (ch >= 'A' && ch <= 'Z') {
				
				ch = Character.toLowerCase(ch);
				arr.add(ch);
			}
		}

		
		return arr.size() == 26;
	}

	
	public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the String to check pangram or not :");
		String str = s.next();

		if (checkPangram(str))
			System.out.println("String is a Pangram");
		else
			System.out.println("String is Not a Pangram");
	}
}


