package com.yakuphan.hw04.q03;

import com.yakuphan.hw04.q02.SumOfFactors;

import java.util.Scanner;

public class FriendsNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = Integer.parseInt(inp.nextLine());
        System.out.println("Enter second number:");
        //We get the 2 numbers we want to compare from the user
        int num2 = Integer.parseInt(inp.nextLine());
        areFriends(num1, num2);
        //we define the method

    }
    public static void areFriends(int num1, int num2){
        //We call the sumfactors method we wrote before.
        int sum1 = SumOfFactors.sumFactors(num1);
        int sum2 = SumOfFactors.sumFactors(num2);

        if(sum1==num2 && sum2 == num1){
            System.out.println("They are friends number");
            //if sum2 =num1 and sum1 =num2 are friend numbers
        }else
            System.out.println("They are not friends number");
    }

}

