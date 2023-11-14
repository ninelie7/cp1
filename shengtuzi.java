import java.util.Scanner;

public class shengtuzi {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fk2(i)+" ");
        }
    }

    public static int fk2(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fk2(n - 1) + fk2(n - 2);
        }
    }
}