package homework_9;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер документа. Номер документа должен начинаться с 555, " +
                "содержать поледовательность abc, заканчиваться на 1a2b: ");
        String docNumber = input.nextLine();

        try {
            validateNumber555(docNumber);
            validateNumberAbc(docNumber);
            validateNumber1a2b(docNumber);
            System.out.println("Документ соответствует требованиям");
        } catch (Exception555 e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (AbcException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception1a2b e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    public static void validateNumber555(String number) throws Exception555 {
        String numberContained = "555";
        if (!number.startsWith(numberContained))
            throw new Exception555("Документ не начинается с 555");
    }

    public static void validateNumberAbc(String number) throws AbcException {
        String numberContained = "abc";
        if (!number.contains(numberContained))
            throw new AbcException("Документ не содержит abc");
    }


    public static void validateNumber1a2b(String number) throws Exception1a2b {
        String numberContained = "1a2b";
        if (!number.endsWith(numberContained))
            throw new Exception1a2b("Документ не заканчивается на 1a2b");
    }
}
