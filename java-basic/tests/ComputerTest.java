import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void checkMemory() {
        Computer computer1 = new Computer(64, 9.7);
        assertEquals(64, computer1.checkMemory());
    }
}