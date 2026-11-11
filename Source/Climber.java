package Source;

public class Climber extends Mechanism{
    public Climber(){
        super("Climber");
    }
    @Override 
    public void setPosition(double position) {
        if (position <= 30 && position >= 0){
            super.position = position;
        }
        else {
        System.out.println("Pick a value between 0 and 30 cm");
        }
    }
    public void extend(double extend){
        if (this.position + extend <= 180 && this.position >= 0){
            this.setPosition(this.position + extend);
        } else {
            System.out.println("Resulting value is not between 0 and 30 cm");
        }
    } 
    public void retract(){
        this.setPosition(0);
    }
}
 
