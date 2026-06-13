import java.util.Scanner;

class Solution19 {
    public void pattern19(int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= 2 * i; s++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= 2 * (n - i); s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        Solution19 s = new Solution19();
        s.pattern19(n);
        sc.close();
    }
}