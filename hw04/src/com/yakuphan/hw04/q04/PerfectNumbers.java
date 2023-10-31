package com.yakuphan.hw04.q04;

import com.yakuphan.hw04.q02.SumOfFactors;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your number:");
        //We want number input from the user
        int num = inp.nextInt();

        if(isPerfect(num)){
            System.out.println("Your number is perfect");
        }else
            System.out.println("Your number is not perfect");



    }
    public static boolean isPerfect(int num){
        return SumOfFactors.sumFactors(num) == num;
    }
    //We enter the entered number into the sumfactors method we wrote before.
    //If the result is equal to our number, it is a perfect number.
}

class FourDigitPerfectNum{
    public static void main(String[] args) {
        for(int i=1000; i<=9999; i++){
            //We test numbers from 1000 to 9999 in the isperfect method with a for loop.
            if(PerfectNumbers.isPerfect(i)){
                System.out.println(i);
                //If it's perfect, we print it.
            }
        }
    }
}