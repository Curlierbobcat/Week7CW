package Source;
public class Intake extends Mechanism implements Loggable{
    private Motor spinning;
    private Motor deployment;
    boolean hasGamePiece = false;
    
    public Intake() { 
        super("Intake");
        spinning = new Motor("spinning");
        deployment = new Motor("deployment");
    }
        @Override
    public void setPosition(double position){
    if (0 <= position && 90 >= position){
        updatePosition(position);
    } else {
        System.out.println("Insert a value between 0 and 90 degrees, inclusive");
        } 
    }
    public void takein() {
         spinning.setSpeed(50); 
         
    }
    public void takeout() {
         spinning.setSpeed(-50); 
         System.out.println(spinning.getSpeed());
    }

    public void deploy(){
        setPosition(0);
        
    }
    public void retract(){
        setPosition(90);
    }
    public void collectPeice(){
        deployment.setSpeed(-50);
        this.hasGamePiece = true;
        System.out.println(deployment.getSpeed());
        
    }
    public void ejectPeice() {
        deployment.setSpeed(50);
        this.hasGamePiece = false;

    }
    public void stopSpinner() {
        spinning.stop();
    }
    public void stopDeployer() {
        deployment.stop();
        spinning.stop();
    }
    public void stop() {
        spinning.stop();
        deployment.stop();
    }
    public void printStatus() { 
        System.out.println("Speed of deployment motor is " + deployment.getSpeed());
        System.out.println("Speed of spinning motor is " + spinning.getSpeed());
        System.out.println("Angle of intake is " + getPosition() + " degrees");
        System.out.println("Has game peice: " + this.hasGamePiece);
    }

}
