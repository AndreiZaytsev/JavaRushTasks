package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endWord;
        int output = 0;


        while (true) {
            endWord = scanner.nextLine();
            if (endWord.equals("ENTER")) {
                System.out.println(output);
                break;

            } else {
                output += Integer.parseInt(endWord);
            }
        }
    }
}