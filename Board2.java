public class Board2 {
    private Square[][] squares = new Square[8][8];

    public Board() {
        for(int i=0; i<squares.length; i++){
            for(int j=0; j<squares.length; j++){
                this.squares[i][j] = new Square(i, j);
            }
        }
    }

    public Square getSquare(int x, int y) {
        return squares[x][y];
    }

}