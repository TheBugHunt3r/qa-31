package homework_5;


import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        int[][][] myArray = initializeArray();
        System.out.println("Исходный массив:");
        printArray(myArray);
        System.out.print("Введите число для увеличения каждого элемента массива: ");
        int increment = getInput();
        increaseNumbers(myArray, increment);
        System.out.println("\nМассив после увеличения на " + increment + ":");
        printArray(myArray);

    }

    public static int[][][] initializeArray() {
        return new int[][][] {
                {
                        {6, 7, 18}
                },
                {
                        {9, 11, 14},
                        {3, 2, 22}
                },
                {
                        {8, 5},
                        {12, 4, 103},
                        {54, 0, 99, 36}
                }
        };
    }

    public static void increaseNumbers(int[][][] myArray, int increment) {

        for (int outer = 0; outer < myArray.length; outer++){
            for (int inner = 0; inner < myArray[outer].length; inner++){
                for (int inside = 0; inside < myArray[outer][inner].length; inside++){
                    myArray[outer][inner][inside] += increment;
                }
            }
        }
    }

    public static void printArray(int[][][] myArray) {
        for (int outer = 0; outer < myArray.length; outer++) {
            System.out.println("Слой " + outer + ":");
            for (int inner = 0; inner < myArray[outer].length; inner++) {
                for (int inside = 0; inside < myArray[outer][inner].length; inside++) {
                    System.out.print(myArray[outer][inner][inside] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int getInput() {
        return new Scanner(System.in).nextInt();
    }
}



