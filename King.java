/**
 * Created by sharmach on 7/30/2016.
 */
public class King extends Piece {
    @Override
    public void move() {

    }
    public King(int rank, int file){
        this.rank = rank;
        this.file = file;
        this.Alive = true;
    }
}
