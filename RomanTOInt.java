

import java.util.*;

public class RomanTOInt {

     int convert(String s) {

        Map<Character, Integer> arr = new HashMap<>();
        arr.put('I', 1);
        arr.put('V', 5);
        arr.put('X', 10);
        arr.put('L', 50);
        arr.put('C', 100);
        arr.put('D', 500);
        arr.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && arr.get(s.charAt(i)) < arr.get(s.charAt(i + 1))) {
                ans -= arr.get(s.charAt(i));
            }

            else {
                ans += arr.get(s.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("Enter the Roman number :");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        RomanTOInt R=new RomanTOInt();
        int r = R.convert(str);
        System.out.println("Integer form of Roman Numeral is " + r);
    }
}
