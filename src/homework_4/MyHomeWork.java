package homework_4;

import java.util.Random;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {


    }

    public static void setFirstArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int yourNumber = input.nextInt();
        int[] firstArray = new int[]{2, 7, 5, 4, 9};
        boolean found = false;
        for (int index = 0; index < firstArray.length; index++) {
            if (firstArray[index] == yourNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Number " + yourNumber + " is in array");
        } else {
            System.out.println("Number " + yourNumber + " is NOT in array");
        }
    }

    public static void deleteNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to delete: ");
        int numbersToDelete = input.nextInt();
        int[] secondArray = new int[]{2, 7, 5, 4, 9};
        int count = 0;
        for (int index = 0; index < secondArray.length; index++) {
            if (secondArray[index] == numbersToDelete) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Такого числа нет");
        } else {
            int[] secondArrayUpd = new int[secondArray.length - count];
            int ind = 0;
            for (int index = 0; index < secondArray.length; index++) {
                if (secondArray[index] != numbersToDelete) {
                    secondArrayUpd[ind++] = secondArray[index];
                }
            }
            System.out.println("Новый массив: ");
            for (int index = 0; index < secondArrayUpd.length; index++) {
                System.out.println(secondArrayUpd[index]);
            }
        }
    }

    public static void setRandomArray() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int arraySize = input.nextInt();
        int[] randomArray = new int[arraySize];
        for (int index = 0; index < randomArray.length; index++) {
            System.out.println(random.nextInt(1, 11));
        }
        int min = randomArray[0];
        int max = randomArray[0];
        int sum = randomArray[0];
        for (int index = 0; index < arraySize; index++) {
            if (randomArray[index] < min) {
                min = randomArray[index];
            }
            if (randomArray[index] > max) {
                max = randomArray[index];
            }
            sum += randomArray[index];
        }
        double avg = (double) sum / arraySize;
        System.out.println("Максимальное значение: " + min);
        System.out.println("Минимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }

    public static void setTwoArrays() {
        int[] firstArray = new int[]{2, 8, 5, 4, 11};
        int[] secondArray = new int[]{7, 13, 1, 3, 9};
        for (int index = 0; index < firstArray.length; index++) {
            System.out.print(firstArray[index] + " ");
        }
        System.out.println();
        for (int index = 0; index < secondArray.length; index++) {
            System.out.print(secondArray[index] + " ");
        }
        System.out.println();
        int sum1 = 0;
        for (int index = 0; index < firstArray.length; index++) {
            sum1 = sum1 + firstArray[index];
        }
        double avg1 = (double) sum1 / firstArray.length;
        int sum2 = 0;
        for (int index = 0; index < secondArray.length; index++) {
            sum2 = sum2 + secondArray[index];
        }
        double avg2 = (double) sum2 / firstArray.length;
        System.out.println("Среднее первого массива: " + avg1);
        System.out.println("Среднее второго массива: " + avg2);
        if (avg1 > avg2) {
            System.out.println("Среднее первого массива больше");
        } else if (avg2 > avg1) {
            System.out.println("Среднее второго массива больше");
        } else {
            System.out.println("Средние арифметические массивов равны");
        }
    }

}





