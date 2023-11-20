package Motherboard;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MotherboardTest {

    @Test
    void testGetModel() {
        Motherboard motherboard = new Motherboard("Model1", "Platform1", "Socket1", "Chipset1", 4, 100);
        assertEquals("Model1", motherboard.getModel());
    }

    @Test
    void testGetPlatform() {
        Motherboard motherboard = new Motherboard("Model2", "Platform2", "Socket2", "Chipset2", 8, 150);
        assertEquals("Platform2", motherboard.getPlatform());
    }

    @Test
    void testGetSocket() {
        Motherboard motherboard = new Motherboard("Model3", "Platform3", "Socket3", "Chipset3", 16, 200);
        assertEquals("Socket3", motherboard.getSocket());
    }

    @Test
    void testGetChipset() {
        Motherboard motherboard = new Motherboard("Model4", "Platform4", "Socket4", "Chipset4", 32, 250);
        assertEquals("Chipset4", motherboard.getChipset());
    }

    @Test
    void testGetMemorySlots() {
        Motherboard motherboard = new Motherboard("Model5", "Platform5", "Socket5", "Chipset5", 64, 300);
        assertEquals(64, motherboard.getMemorySlots());
    }

    @Test
    void testGetPrice() {
        Motherboard motherboard = new Motherboard("Model6", "Platform6", "Socket6", "Chipset6", 128, 350);
        assertEquals(350, motherboard.getPrice());
    }
}