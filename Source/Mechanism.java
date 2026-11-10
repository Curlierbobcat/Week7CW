package Source;
// IN CLASS: Start with this ordinary parent class.
// Later, we will discuss whether Mechanism should be abstract.
public abstract class Mechanism {
    private String name;
    protected double position;

    public Mechanism(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() { return name; }
    public double getPosition() { return position; }

    // Child classes can reuse this method using super.setPosition(...).
    public abstract void setPosition(double position);

    //this needs to be called in the child class
    protected void updatePosition(double position){
        this.position = position;
    }
}
