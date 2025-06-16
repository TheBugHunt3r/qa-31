package homework_5;


public class MyHomeWorkTwo {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        String[][] chess = new String[8][8];
        fillChess(chess);
        readChess(chess);
    }

    public static void fillChess(String[][] chess) {
        for (int rows = 0; rows < chess.length; rows++) {
            for (int cols = 0; cols < chess[rows].length; cols++) {
                if ((rows + cols) % 2 == 0) {
                    chess[rows][cols] = "W ";
                } else {
                    chess[rows][cols] = "B ";
                }
            }
        }
    }

    public static void readChess(String[][] chess) {
        for (int rows = 0; rows < chess.length; rows++) {
            for (int cols = 0; cols < chess[rows].length; cols++) {
                System.out.print(chess[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}

