package Game;

public class Square {

    boolean square[][];


    void initSquare() {
        square = new boolean[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                square[i][j] = Math.random() < 0.5;
            }
        }
    }

    void showSquare() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(square[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}