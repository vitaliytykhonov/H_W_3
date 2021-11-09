package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("1. Заповнити масив тільки парними числами");
            System.out.print("Even {");
            for (var i=0; i<=10; i++) {
            if (i%2 == 0){
                System.out.print(" " +i+ " ");
            }
        }
        System.out.println("}");
        System.out.println();


        System.out.println("2.Заповнити масив рандомними числами , почитатйте про класс Random");
        Random rd = new Random();
          int [] arr = new int[10];
        System.out.print("randomArray = {");
        for (var i=0; i<10; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(" " +arr[i]+ " ");
        }
        System.out.println("}");
        System.out.println();


        System.out.println("3.Вивести середнє значення масиву");
        double averageValueArray;
//        averageValueArray = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9]) / 10;
//        System.out.println("averageValueArray = " +averageValueArray);
//        System.out.println();
        if (10>0) {
            double sum=0;
            for (var j = 0; j < 10; j++) {
                sum += arr[j];
            }
            averageValueArray = sum/10;
            System.out.println("averageValueArray = " +averageValueArray);
        }
        System.out.println();


        System.out.println("4.Вивести найменше значення в масиві");
        int min = arr[0];
        for (int i=0; i<10; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println("min = " +min);
        System.out.println();


        System.out.println("5.Вивести найбільше значення масиву");
        int max = arr[0];
        for (int i=0; i<10; i++){
            if (arr[i]>max)
                max=arr[i];
        }
        System.out.println("max = " +max);
        System.out.println();


        System.out.println("6.Вивести значення парних індексів масиву");
        System.out.print("evenIndicesArray = {");
        for (int i=0; i<10; i++){
            if (i%2 == 0){
               int evenIndicesArray = arr[i];
                System.out.print(" " +evenIndicesArray);
            }
        }
        System.out.println(" }");
        System.out.println();


        System.out.println("7.Вивести перших 20 символів з таблиці ASCI");
//        char symbol = int ascii = 1;
//        System.out.println(symbol);

        int [] twix = new int [] {0,1,2,3,4,5,6,7,8,9};
        System.out.print("symbol - ");
        for (int i=0; i< twix.length; i++){
            System.out.print(" " +(char) twix[i]);
        }
        System.out.println();
        System.out.print("token - ");
        for (int i=33; i< 42; i++){
            System.out.print(" " +(char) i);
        }
    }
}
