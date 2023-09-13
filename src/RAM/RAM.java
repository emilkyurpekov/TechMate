package RAM;

public class RAM implements IRAM {
    private double price;
    private String model;
    private int memory;
    private String type;
    private double frequency;

    public RAM(String model, int memory, String type, double frequency,double price) {
        this.price = price;
        this.model = model;
        this.memory = memory;
        setType(type);
        this.frequency = frequency;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getMemory() {
        return this.memory;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public double getFrequency() {
        return this.frequency;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setType(String type) {
        if (!type.equals("DDR4") && !type.equals("DDR5")) {
            throw new IllegalArgumentException("Unsupported memory type.");
        }
        this.type = type;
    }
}
