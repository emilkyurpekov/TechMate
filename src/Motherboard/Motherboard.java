package Motherboard;

public class Motherboard implements IMotherboard {
    private String model;
    private String platform;
    private String socket;
    private String chipset;
    private int memorySlots;
    private int price;

    public Motherboard(String model, String platform, String socket, String chipset, int memorySlots, int price) {
        this.model = model;
        this.platform = platform;
        this.socket = socket;
        this.chipset = chipset;
        this.memorySlots = memorySlots;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getPlatform() {
        return this.platform;
    }

    @Override
    public String getSocket() {
        return this.socket;
    }

    @Override
    public String getChipset() {
        return this.chipset;
    }

    @Override
    public int getMemorySlots() {
        return this.memorySlots;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
