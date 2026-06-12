// package patterns;

import java.util.Scanner;

class Solution6 {
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {//0 0<3
            for (int k = 0; k <= n - i - 1; k++) { //0<=3-0-1=2
                System.out.print(" ");//print space twice
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of rows");
        int n = sc.nextInt();
        Solution6 s = new Solution6();
        s.pattern7(n);
        // sc.close();
    }
}