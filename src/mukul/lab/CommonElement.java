package mukul.lab;

import java.util.Scanner;

public class CommonElement {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]){
                    c = i;
                    break;
                }
            }
            System.out.println(a[c]);
        }
    }
}
