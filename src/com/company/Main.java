package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        turnOn(0, in.nextInt());
    }

    public static void sw(String s){
        System.out.println(s);
    }

    public static void turnOn(int c, int n){
        if(c == 0){
            if(n == 1){
                sw("+1");
            }
            else if(n == 2){
                turnOn(0, 1);
                sw("+2");
            }
            else{
                turnOn(1, n-1);
                sw("+" + (n));
                turnOn(0, n-2);
            }
        }
        else if(c == 1){
            if(n == 1){
                sw("+1");
            }
            else{
                turnOn(1, n-1);
                sw("+" + (n));
                turnOn(2, n-1);
            }
        }
        else{
            if(n == 1){
                sw("-1");
            }
            else{
                turnOn(1, n-1);
                sw("-" + (n));
                turnOn(2, n-1);
            }
        }
    }
}
