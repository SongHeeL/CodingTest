package com.example.codingtest.Conditional;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x <= -1){
            if(y <= -1){
                System.out.println("3");
            }
            if (y >= 1) {
                System.out.println("2");
            }
        } else if (x >= 1) {
            if (y <= -1){
                System.out.println("4");
            }
            if (y >= 1 ){
                System.out.println("1");
            }
        }
    }
}
