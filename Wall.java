package JavaCore;

public class Wall implements Let {
    private float height;

    public Wall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(Champions champions) {
        if (champions instanceof Jumpable)
            return ((Jumpable) champions).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }
}