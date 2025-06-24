package homework_6;

import homework_6.atm.CreditCard;

public class MyAgenda {
    public static void main(String[] args) {
        createAddMoney();
    }

    public static void createAddMoney() {
        CreditCard card1 = new CreditCard(20395064493L, 1945L);
        CreditCard card2 = new CreditCard(20395064494L, 2500L);
        CreditCard card3 = new CreditCard(20395064495L, 3000L);

        card1.addMoney(500);
        card2.addMoney(300);

        card3.takeMoney(1000);

        System.out.println("Card 1 information:");
        System.out.println(card1.getCreditCardInformation());

        System.out.println("Card 2 information:");
        System.out.println(card2.getCreditCardInformation());

        System.out.println("Card 3 information:");
        System.out.println(card3.getCreditCardInformation());

    }
}
