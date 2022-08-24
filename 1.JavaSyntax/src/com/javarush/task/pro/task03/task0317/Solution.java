package com.javarush.task.pro.task03.task0317;


import java.util.Scanner;

/* 
Пищевой конвеер
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }

    }
}
