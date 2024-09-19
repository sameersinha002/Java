// package Assignment1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c)
            System.out.println(a + " is greatest.");
        else if (b > c)
            System.out.println(b + " is greatest.");
        else
            System.out.println(c + " is greatest.");

        sc.close();
    }
}
