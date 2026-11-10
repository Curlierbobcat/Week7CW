package Source;
// GUIDED IN CLASS: Use this starter to demonstrate extends, super, and @Override.
public class Arm extends Mechanism {
    public Arm() {
        super("Arm");
    }
        @Override
       public void setPosition(double position){
        if(position <=180 && position >= 0){
            updatePosition(position);
        } else{
            System.out.println("Enter an angle betweeon 0 and 180");
        }

    }
  

    // TODO (together): Override setPosition(double position).
    // Arm angles must stay between 0 and 180 degrees.
    // For valid positions, call super.setPosition(position).
    // For invalid positions, print an error and leave position unchanged.
}
