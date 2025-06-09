package homework_3;

import java.util.Scanner;


public class MyHomeWork {
    public static void main(String[] args) {
        getTimeOfYear();
        getTimeOfYear2();
        determineParity();
        getWeatherForecast();
        getColour();
        getOddNumbers();
        reduceNumbers();
        getSum();
        getSequence();
        getFirstNumbers();
        getSquares();
    }

    public static void getTimeOfYear() {
        System.out.print("Please enter a value: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("It is winter");
                break;
            case 2:
                System.out.println("It is winter");
                break;
            case 3:
                System.out.println("It is spring");
                break;
            case 4:
                System.out.println("It is spring");
                break;
            case 5:
                System.out.println("It is spring");
                break;
            case 6:
                System.out.println("It is summer");
                break;
            case 7:
                System.out.println("It is summer");
                break;
            case 8:
                System.out.println("It is summer");
                break;
            case 9:
                System.out.println("It is autumn");
                break;
            case 10:
                System.out.println("It is autumn");
                break;
            case 11:
                System.out.println("It is autumn");
                break;
            case 12:
                System.out.println("It is winter");
                break;
            default:
                System.out.println("There is no such month");
                break;
        }
    }

    public static void getTimeOfYear2() {
        System.out.print("Please enter a value: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        if (month >= 1 && month < 3 || month == 12) {
            System.out.println("It is winter");
        } else if (month >= 3 && month < 6) {
            System.out.println("It is spring");
        } else if (month >= 6 && month < 9) {
            System.out.println("It is summer");
        } else if (month >= 9 && month < 12) {
            System.out.println("It is autumn");
        } else {
            System.out.println("There is no such month");
        }
    }

    public static void determineParity() {
        System.out.print("Please enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    public static void getWeatherForecast() {
        System.out.print("Температура на улице: ");
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    public static void getColour() {
        System.out.print("Please enter a value: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        switch (num1) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
            default:
                System.out.println("Corrupted");
                break;
        }
    }

    public static void getOddNumbers() {
        for (int counter = 1; counter <= 99; counter++) {
            if (counter % 2 == 0)
                System.out.println(counter);
        }
    }

    public static void reduceNumbers() {
        for (int counter = 5; counter >= 1; counter--) {
                System.out.println(counter);
        }
    }

    public static void getSum() {
        System.out.print("Please enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int num2 = input.nextInt();
        if (num2 <= 0) {
            System.out.println("Error");
        } else {
            int sum1 = 0;
            for (int a = 1; a <= num2; a++) {
                sum1 += a;
            }
            System.out.println("The sum of the numbers is: " + sum1);
        }
    }

    public static void getSequence() {
        int count = 7;
        while (count <= 98) {
            System.out.println(count);
            count += 7;
        }
    }

    public static void getFirstNumbers() {
        int b = 10;
        int start = 0;
        int step = -5;
        for (int i = 0; i < b; i++) {
            System.out.println(start + step * i);
        }
    }

    public static void getSquares() {
        for (int c = 10; c <= 20; c++) {
            int square = c * c;
            System.out.println(square);
        }
    }
}




