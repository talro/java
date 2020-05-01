import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void checkMemory64() {
        Computer computer1 = new Computer(64, 9.7);
        assertEquals(64, computer1.checkMemory());
    }

    @Test
    void checkMemory32() {
        Computer computer1 = new Computer(32, 9.7);
        assertEquals(32, computer1.checkMemory());
    }

    @Test
    void getSpeed() {
        Computer computer2 = new Computer(16, 3.4);
        assertEquals(3.4, computer2.getSpeed());
    }

    @Test
    void increaseSpeed() {
        Computer computer2 = new Computer(16, 3.4);
        computer2.increaseSpeed(0.6);
        assertEquals(4.0, computer2.getSpeed());
    }


    @Test
    void decreaseSpeed() {

    }

    @Test
    void turnOn() {
        Computer computer2 = new Computer(16, 3.4);
        assertFalse(computer2.isTurnedOn());
        computer2.turnOn();
        assertTrue(computer2.isTurnedOn());
    }

    @Test
    void turnOff() {

    }
}