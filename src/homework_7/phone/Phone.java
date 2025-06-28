package homework_7.phone;

public class Phone {
   private long number;
   private String model;
   private int weight;

    public Phone() {
        this(-1L, "Unknown", -1);
    }

    public Phone(long number, String model) {
        this(number, model, -1);
    }

    public Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getPhoneInfo() {
        return "Phone number is: " + number + "\n" +
                "Phone model is: " + model + "\n" +
                "Phone weight is: " + weight + "\n";
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ": ");
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + ": " + number);
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(long... phoneNumbers) {
        System.out.println("Message will be sent to the following numbers:");
        for (long el : phoneNumbers) {
            System.out.println(el);
        }
    }
}

