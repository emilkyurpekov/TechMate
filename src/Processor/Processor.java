package Processor;

public class Processor implements IProcessor {
    private String model;
    private double GHz;
    private double turboBoostGHz;
    private String socket;
    private int physicalCores;
    private int logicalCores;
    private double price;
    public Processor(String model, double gHz, double turboBoostGHz, String socket, int physicalCores, int logicalCores, double price) throws IllegalArgumentException{
        setModel(model);
        this.GHz = gHz;
        this.turboBoostGHz = turboBoostGHz;
        this.socket = socket;
        this.physicalCores = physicalCores;
        this.logicalCores = logicalCores;
        this.price = price;
    }

    public void setModel(String model) throws IllegalArgumentException {
        if(!model.contains("Intel") && !model.contains("AMD")){
            throw new IllegalArgumentException("Unsupported processor model.");
        }
        this.model = model;
    }
    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getGHz() {
        return this.GHz;
    }

    @Override
    public double getTurboBoostGHz() {
        return this.turboBoostGHz;
    }

    @Override
    public String getSocket() {
        return this.socket;
    }

    @Override
    public int getPhysicalCores() {
        return this.physicalCores;
    }

    @Override
    public int getLogicalCores() {
        return this.logicalCores;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
