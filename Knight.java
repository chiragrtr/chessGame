/**
 * Created by sharmach on 7/30/2016.
 */
public class Knight extends Piece {
    @Override
    public void move() {

    }
    public Knight(int rank, int file){
        this.rank = rank;
        this.file = file;
        this.Alive = true;
    }

    public int getRank(){
        return this.rank;
    }

    public int getFile(){
        return this.file;
    }
}