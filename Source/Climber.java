package Source;

public class Climber extends Mechanism implements Loggable{
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
    public void extend(){
        this.setPosition(30);

    } 
    public void retract(){
        this.setPosition(0);
    }
    public void printStatus(){
        System.out.println("Climber's position is: " + this.position + "cm");
    }
}
 
