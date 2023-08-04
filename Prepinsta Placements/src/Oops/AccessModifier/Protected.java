package Oops.AccessModifier;

public class Protected {
    //this modifier gives us accessibility in subclass of the parent class,
    //by default, it is just like default modifier, but it gives 1 additional accessibility for subclass
    protected int name;
    public int roll;
    private int mob;

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }
}
