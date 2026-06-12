package patterns;

import java.util.Scanner;

class Solution10 {
    public void pattern11(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int k = 1; k <= i; k++)
                    if (k % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                System.out.println();
            } else {
                for (int j = 1; j <= i; j++)
                    if (j % 2 == 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        Solution10 s = new Solution10();
        s.pattern11(n);
        sc.close();
    }
}