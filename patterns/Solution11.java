package patterns;

import java.util.Scanner;

class Solution11 {
    public void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            for (int l = i; l >= 1; l--) {
                // sum = sum * 10 + l;
                System.out.print(l);
                // sum = 0;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        Solution11 s = new Solution11();
        s.pattern12(n);
        sc.close();
    }
}