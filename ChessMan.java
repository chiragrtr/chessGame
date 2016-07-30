/**
 * Created by sharmach on 7/30/2016.
 */
public abstract class ChessMan {
    protected int rank;
    protected int file;
    protected boolean Alive;

    public boolean isAlive() {
        return Alive;
    }

    public void setAlive(boolean alive) {
        Alive = alive;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    public abstract void move();
}
