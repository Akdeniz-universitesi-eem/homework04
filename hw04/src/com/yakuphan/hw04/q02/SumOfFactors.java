package com.yakuphan.hw04.q02;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {

        Scanner inp= new Scanner(System.in);
        ////We will save the input received from the user with the scanner command.
        System.out.println("Enter a number:"); //We are asking for input from the user
        int num = Integer.parseInt(inp.nextLine()); //We assign the received input to the int num variable
        System.out.println(sumFactors(num)); //We run the received variable in the method and print the result.

    }
    public static int sumFactors(int num) {

        int sum=0; //We defined a variable for multiplier sums
        for(int i=1; i<num; i++){ //We took mode with for loop to find the factors
            if((num % i) == 0){
                sum += i;
            }
        }
        return sum; //We returned the result as a sum.
    }

}
