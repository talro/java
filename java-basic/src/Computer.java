public class Computer {

    // Private Attributes
    int memory;
    double speed;

    // Default Constructor
    public Computer() {
    }

    public Computer(int memory, double speed) {
        this.memory = memory;
        this.speed = speed;
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

    public int checkMemory() {
        for( int i=0; i<=this.memory; i++) {
            System.out.println(i);
        }
        return this.memory;
    }
}
