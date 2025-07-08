package homework_11;

public class MyMain {
    public static void main(String[] args) {
        MyArray<Object> list = new MyArray<>();

        list.addElement("Java");
        list.addElement(842);
        list.addElement(0.3);
        list.addElement(true);

        list.printArray();
        System.out.println();
        list.removeElement(2);
        System.out.println();
        list.printArray();
        System.out.println();

        System.out.println(list.containsElement(true));
        System.out.println();
        System.out.println(list.getElement(1));

        list.clearArray();
        list.printArray();
    }
}
