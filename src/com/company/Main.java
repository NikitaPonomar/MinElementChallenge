package com.company;

import java.util.Scanner;

public class Main {
    // Application helps to find MIN value in Array
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the quantity of elements");
        int count = scanner.nextInt();
        scanner.nextLine(); // to handle ENTER key
        int[] myArray= readIntegers(count);
        System.out.println("the MIN value = " + findMin(myArray));
        scanner.close();

    }

    private static int[] readIntegers(int count){
        int[] readArray = new int[count];
        String input="";
        System.out.println("Please enter " + count + " integer numbers");
        for (int i=0; i<count;i++) {

            while(!scanner.hasNextInt()){
                System.out.println("Wrong value, Please input integer number");
                input=scanner.nextLine(); //to avoid endless loop
            }
            readArray[i]=scanner.nextInt();
            scanner.nextLine(); // to handle ENTER key
        }
        return readArray;
    }

    private static int findMin (int [] myArray) {
        int min=myArray[0];
        for (int i=0; i<myArray.length;i++){
            if (myArray[i]<min) min=myArray[i];
        }
        return min;
    }



}
