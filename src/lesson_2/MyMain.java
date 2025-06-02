package lesson_2;

public class MyMain {
    public static void main(String[] args) {
    getBasicVariableInfo();
    showVariableOutput();
    getOperatorsInformation();
    makeTypeCasting();
    }

    public static void getBasicVariableInfo() {
        String name = "Dft";
        System.out.println("My name is: Alisa");
        System.out.println("My surname is: P");
        System.out.println("My age is: 21");
        System.out.println("My profession is: QA");

        byte myByteValue = 19;
        short myShortValue = 23455;
        int myIntValue = 100000011;
        long myLongValue = 20L;

        char letter = 'A';

        float myFloatNumber = 3.612745F;
        double myDoubleNumber = 237.281199293;

        boolean isQA = true;
        boolean isDev = false;

        String myName = "Alisa";
        String mySurname = "P";
    }

    public static void showVariableOutput() {
        String name = "Alisa";
        String surname = "P";
        int age = 21;
        String profession = "QA";
        char prefix = 'R';
        boolean isQA = true;
        double score = 11.1;

        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
        System.out.println("My age is " + age);
        System.out.println("My profession is " + profession);
        System.out.println("My prefix is " + prefix);
        System.out.println("Am i QA? " + isQA);
        System.out.println("My score " + score);

        System.out.println("My name is " + name + "\n" + "My surname is " +
                surname + "\n" + "My age is " + age + "\n" );
    }

    public static void getOperatorsInformation() {
        System.out.println("+, -, /, *, =, %, ++, --");

        double weight = 23.580;
        double weightA = 12.99;
        int height = 177;
        int heightA = 160;

        double sum = weight - weightA;
        double sumA = weightA + weight;
        double sumB = weight * weightA;
        double sumC = weight / weightA;

        System.out.println(sum);
        System.out.println(sumA);
        System.out.println(sumB);
        System.out.println(sumC);

        System.out.println("How much is 5 + 10? " + (5 + 10));
        System.out.println("How much is 5 * 10? " + (5 * 10));
        System.out.println("Result: " + 5 + (10 - 6) / (5 * 10));
        System.out.println("20 четное число? " + (40%2));

        // и &&, или ||, не равно !=, равно ==

        int cost = 100;
        cost = cost + 1;
        cost+= 1;
        cost++;

        System.out.println(cost);

        int costB = 10;
        costB/= 5;

        System.out.println("Result: " + (costB/2));
    }

    public static void makeTypeCasting() {
        int height = 160;
        double weight = 38.8;

        double sum = height / weight;

        System.out.println(sum);

        double heightY = 160.5;
        int weightY = 68;

        int newSum = (int) heightY / weightY;

        System.out.println(newSum);
    }
}
