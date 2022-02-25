package JavaCore;

public class Water implements Let {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Champions champions) {
        if (champions instanceof Swimable)
            return ((Swimable) champions).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}
