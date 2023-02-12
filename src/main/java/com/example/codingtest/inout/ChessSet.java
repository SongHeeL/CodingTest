package com.example.codingtest.inout;

import java.util.Scanner;

public class ChessSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 1;
        int B = 1;
        int C = 2;
        int D = 2;
        int E = 2;
        int F = 8;

        A = A - sc.nextInt();
        B = B - sc.nextInt();
        C = C - sc.nextInt();
        D = D - sc.nextInt();
        E = E - sc.nextInt();
        F = F - sc.nextInt();

        System.out.print(A + " ");
        System.out.print(B + " ");
        System.out.print(C + " ");
        System.out.print(D + " ");
        System.out.print(E + " ");
        System.out.print(F + " ");

    }
}
