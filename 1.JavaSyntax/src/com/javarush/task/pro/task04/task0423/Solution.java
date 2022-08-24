package com.javarush.task.pro.task04.task0423;

import java.sql.Array;
import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int number = 0;
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            number = (array[i] + number);
        }
        System.out.println(number/ array.length);
    }
}
