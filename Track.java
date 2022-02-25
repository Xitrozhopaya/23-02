package JavaCore;

public class Track implements Let {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Champions champions) {
        return champions.run(length);
    }
    public int getLength(){
        return length;
    }
}