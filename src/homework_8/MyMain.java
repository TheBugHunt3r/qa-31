package homework_8;

import homework_8.fig.Circle;
import homework_8.fig.Figure;
import homework_8.fig.Rectangle;
import homework_8.fig.Triangle;
import homework_8.staff.Accountant;
import homework_8.staff.Director;
import homework_8.staff.Employee;

public class MyMain {
    public static void main(String[] args) {
        getFigure();
        getPosition();
    }

    public static void getFigure() {
        Figure[] figures = {
                new Triangle(3, 4, 5),
                new Rectangle(4, 5),
                new Circle(3),
                new Triangle(5, 5, 5),
                new Rectangle(2, 6)
        };

        double sumTotal = 0;
        for (Figure el : figures) {
            sumTotal += el.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + sumTotal);

    }

    public static void getPosition() {
        Director director = new Director();
        Accountant accountant = new Accountant();
        Employee employee = new Employee();

        director.printPosition();
        accountant.printPosition();
        employee.printPosition();
    }


}
