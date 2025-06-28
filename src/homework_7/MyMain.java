package homework_7;

import homework_7.phone.Phone;

public class MyMain {
    public static void main(String[] args) {
        getPhone();
    }

    public static void getPhone() {
        Phone phone1 = new Phone(375299747634L, "iPhone 15", 171);
        Phone phone2 = new Phone(375297747633L, "Samsung Galaxy S25", 162);
        Phone phone3 = new Phone(375294447632L, "Google Pixel 9", 198);

        System.out.println("Phone 1 info: ");
        System.out.println(phone1.getPhoneInfo());

        System.out.println("Phone 2 info: ");
        System.out.println(phone2.getPhoneInfo());

        System.out.println("Phone 3 info: ");
        System.out.println(phone3.getPhoneInfo());

        System.out.println();

        phone1.receiveCall("Ваня");
        System.out.println("Номер телефона: " + phone1.getNumber());

        phone2.receiveCall("Катя");
        System.out.println("Номер телефона: " + phone2.getNumber());

        phone3.receiveCall("Юля");
        System.out.println("Номер телефона: " + phone3.getNumber());

        System.out.println();

        phone1.receiveCall("Женя", 375299747634L);

        System.out.println();

        phone1.sendMessage(375299747634L, 375297747633L, 375294447632L);

    }

}
