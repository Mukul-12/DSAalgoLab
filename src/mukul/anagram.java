package mukul;

import java.util.*;

public class anagram {
    private static final int MAX_VALUE = 2;

    public static void main(String[] args) {
        String a[] = new String[MAX_VALUE];
        String b[] = new String[MAX_VALUE];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string value for A string Array");
        for (int i = 0; i < MAX_VALUE; i++) {
            a[i] = sc.nextLine();
        }
        System.out.println("Enter string value for B string Array");
        for (int i = 0; i < MAX_VALUE; i++) {
            b[i] = sc.nextLine();
        }
        checkAnagram(a, b);

    }

    public static void checkAnagram(String[] a1, String[] a2) {
        if (a1[0].length() != a2[0].length()) {
            System.out.println("false");
        } else {
            char c[] = new char[a1[0].length()];
            for (int j = 0; j < a1[0].length(); j++) {
                c[j] = a1[0].charAt(j);
                System.out.println(c);
            }

        }


        if (a1[1].length() != a2[1].length()) {
            System.out.println("false");
        } else {
            char c[] = new char[a1[1].length()];
            for (int j = 0; j < a1[1].length(); j++) {
                c[j] = a1[1].charAt(j);
                System.out.println(c);
            }

        }


    }
}