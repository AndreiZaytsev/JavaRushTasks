package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBottles = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        double result = numberOfBottles * 1.0 / numberOfPeople;
        System.out.println(result);

    }
}