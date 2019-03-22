package Hello;

public class Square {

    private boolean square[][];
    private final int SQUARELENGTH = 12;

    public void initSquare() {
        this.square = new boolean[SQUARELENGTH][SQUARELENGTH];
        for (int x = 0; x < SQUARELENGTH; x++) {
            for (int y = 0; y < SQUARELENGTH; y++) {
                square[x][y] = Math.random() > 0.5;

            }
        }


    }

    public void showSquare() {
        for (int x = 0; x < SQUARELENGTH; x++) {
            for (int y = 0; y < SQUARELENGTH; y++) {
                System.out.print((square[x][y]) ? "1  " : "0  ");
            }
            System.out.println();
        }

    }
}


