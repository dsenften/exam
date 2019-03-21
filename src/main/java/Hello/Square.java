package Hello;

public class Square {

    private boolean square[][];
    private final int SQUARELENGTH = 12;

    public  void initSquare(){
        this.square  = new boolean[SQUARELENGTH][SQUARELENGTH];
        for ( int x = 0; x < SQUARELENGTH; x++ ){
            for ( int y = 0; y < SQUARELENGTH; y++){
                square[x][y] = true;
            }
        }



    }

    public  void showSquare(){
        for ( int x = 0; x < SQUARELENGTH; x++ ){
            for ( int y = 0; y < SQUARELENGTH; y++){
                if (square[x][y]){
                    System.out.print( "1  ");
                }
                else {
                    System.out.print( "0  ");
                }
            }
            System.out.println();
        }



    }
}

