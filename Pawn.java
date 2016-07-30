/**
 * Created by palsulea on 7/30/2016.
 */
public class Pawn extends ChessMan {



    public Pawn(int rank,int file){
        this.rank = rank;
        this.file = file;
    }

    public int getRank(){
     return this.rank;
    }

    public int getFile(){
        return super.file;
    }
    @Override
    public void movement() {

    }


    public void capture() {

    }

    public void promote(){

    }
    public void enPassant(){

    }

}
