import java.util.Scanner;

public class Solution17 {
    public void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i-1; k++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int mid = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j < mid) {
                    System.out.print((char) (ch++));
                    // ch++;
                } else {
                    // ch--;
                    System.out.print((char) (ch--));
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        Solution17 s = new Solution17();
        s.pattern17(n);
        sc.close();
    }
}
