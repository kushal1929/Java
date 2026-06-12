import java.util.Scanner;

class Solution16 {
    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        Solution16 s = new Solution16();
        s.pattern16(n);
        sc.close();
    }
}