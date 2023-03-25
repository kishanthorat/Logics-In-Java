package com.array.a2lowest;

public class SecondLowestNumber {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 2, 25, 30,5,1,1,2}; // Sample array
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < lowest) {
                secondLowest = lowest;
                lowest = array[i];
            } else if (array[i] < secondLowest && array[i] != lowest) {
                secondLowest = array[i];
            }
        }
        
        System.out.println("The second lowest number is: " + secondLowest);

//        if (secondLowest == Integer.MAX_VALUE) {
//            System.out.println("There is no second lowest number.");
//        } else {
//            System.out.println("The second lowest number is: " + secondLowest);
//        }
    }
}