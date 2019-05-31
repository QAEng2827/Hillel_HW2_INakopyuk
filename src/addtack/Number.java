package addtack;

import java.util.Scanner;

public class Number {
   // int firstNum, secondNum,thirdNum;

    public static void main(String Arg[]){
        int firstNum, secondNum,thirdNum;

        System.out.println("Input:");

        Scanner input1 = new Scanner(System.in);
        System.out.print("Input first number: ");
        firstNum=input1.nextInt();
        System.out.print("Input second number: ");
        secondNum=input1.nextInt();
        System.out.print("Input third number: ");
        thirdNum=input1.nextInt();

        System.out.println("Output:");

        int sum = firstNum+secondNum+thirdNum;
        System.out.println("Sum: " + sum);

        int multi = firstNum*secondNum*thirdNum;
        System.out.println("Multiplication: " + multi);


        System.out.print("Average: ");
        System.out.printf("%.2f", average(firstNum,secondNum,thirdNum));

        System.out.println();



        System.out.println("Max value: " + Math.max(firstNum,Math.max(secondNum,thirdNum)) );
        System.out.println("Min value: " + Math.min(firstNum, Math.min(secondNum,thirdNum)));


    }

    private static double average(double x,double y, double z){// почему обязательно статик?

        return (x+y+z)/3;
    }

}
