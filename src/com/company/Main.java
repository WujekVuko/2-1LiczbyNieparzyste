package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = in.nextInt();
        for (int i = 0; i < number; i++) {
            i += 1;
            System.out.print(i + ", ");
        }

        int[] s = new int[number / 2 + number % 2];
        int zero = 1;
        for (int i = 0; i < s.length; i++) {

            s[i] = zero;
            zero += 2;


        }
        System.out.println("lub");
        for (int i = 0; i < s.length - 1; i++) {
            System.out.print(s[i] + ", ");
        }
        System.out.print(s[s.length-1] + ".");
    }
}
