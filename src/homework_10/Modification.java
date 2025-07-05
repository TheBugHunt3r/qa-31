package homework_10;

public class Modification {

    public static void getModification1(StringBuilder docNumber) {
        StringBuilder docModified1 = new StringBuilder(docNumber);
        docModified1.replace(0, 8, "3333-4444");
        System.out.println(docModified1);
    }

    public static void getDocModification2(StringBuilder docNumber) {
        StringBuilder docModified2 = new StringBuilder(docNumber);
        docModified2.replace(5, 8, "***");
        docModified2.replace(14, 17, "***");
        System.out.println(docModified2);
    }

    public static void getDocModification3(StringBuilder docNumber) {
        StringBuilder docModified3 = new StringBuilder(docNumber);
        docModified3.delete(0, 5);
        docModified3.delete(4, 9);
        docModified3.deleteCharAt(8);
        docModified3.deleteCharAt(9);

        String a = docModified3.toString();
        String b = a.toLowerCase();
        System.out.println(b);
    }

    public static void getDocModification4(StringBuilder docNumber) {
        StringBuilder docModified4 = new StringBuilder(docNumber);
        docModified4.delete(0, 5);
        docModified4.delete(4, 9);
        docModified4.deleteCharAt(8);
        docModified4.deleteCharAt(9);

        String a = docModified4.toString();
        String b = a.toUpperCase();
        System.out.println(b);
    }

}
