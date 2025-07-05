package homework_10;

import java.util.Scanner;

public class MyMain {
  public static void main(String[] args) {

      System.out.print("Введите номер документа формата xxxx-yyy-xxxx-yyy-xyxy, " +
              "где x - число, y - буква. " + "\n" + "Номер документа должен начинаться с 555," +
              "содержать поледовательность abc, заканчиваться на 1a2b: ");
      Scanner input = new Scanner(System.in);
      String docNumber = input.nextLine();
      System.out.println(docNumber);

      try {

          validateNumber555(docNumber);
          validateNameAbc(docNumber);
          validateName1a2b(docNumber);
          System.out.println("Номер документа соответствует требованиям" + "\n");
      } catch (Exception555 e) {
          System.out.println(e.getMessage());
      } catch (ExceptionAbc e) {
          System.out.println(e.getMessage());
      } catch (Exception1a2b e) {
          System.out.println(e.getMessage());
      } finally {
          input.close();
      }

      Modification.getModification1(new StringBuilder(docNumber));
      Modification.getDocModification2(new StringBuilder(docNumber));
      Modification.getDocModification3(new StringBuilder(docNumber));
      Modification.getDocModification4(new StringBuilder(docNumber));

  }

  public static void validateNumber555(String number) throws Exception555 {
      String numberContained = "555";
      if (!number.startsWith(numberContained))
          throw new Exception555("Номер документа не начинается с 555" + "\n");
  }

  public static void validateNameAbc(String number) throws ExceptionAbc {
      String numberContained = "abc";
      if (!number.toLowerCase().contains(numberContained))
          throw new ExceptionAbc("Номер документа не содержит abc" + "\n");
  }

  public static void validateName1a2b(String number) throws Exception1a2b {
      String numberContained = "1a2b";
      if (!number.endsWith(numberContained))
          throw new Exception1a2b("Номер документа не заканчивается на 1a2b" + "\n");
  }
}

// 8888-hhh-9999-kkk-1s2n

//5558-ABC-9999-kkk-1a2b