public class Computer {

    // Private Attributes
    int memory;
    double speed;
    boolean turnedOn;

    // Default Constructor
    public Computer() {
    }

    public Computer(int memory, double speed) {
        this.memory = memory;
        this.speed = speed;
        this.turnedOn = false;
    }

    public int getMemory() {
        return memory;
    }

    public double getSpeed() {
        return speed;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int checkMemory() {
        for( int i=0; i<=this.memory; i++) {
            System.out.println(i);
        }
        return this.memory;
    }

    public double increaseSpeed( double x) {
        this.speed+=x;
        return this.speed;
    }

    public double decreaseSpeed( double x) {
        this.speed-=x;
        return this.speed;
    }

    public void turnOn() {
        this.turnedOn = true;
    }

    public void turnOff() {
        this.turnedOn = false;
    }

}
