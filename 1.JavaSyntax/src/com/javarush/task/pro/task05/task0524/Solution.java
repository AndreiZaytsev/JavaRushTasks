package com.javarush.task.pro.task05.task0524;

/* 
Взлом Кибердракона
*/

public class Solution {
    public static int[] coordinates;

    public static void main(String[] args) {
        coordinates = new int[200];
        coordinates[0] = 0;
        coordinates[1] = 1;

        for (int n = 2; n < (coordinates.length); n++){
            coordinates [n] = coordinates [n-2] + 10;
        }
    }
}