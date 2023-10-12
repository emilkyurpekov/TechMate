package coolingSystem;

public class coolingSystem implements IcoolingSystem {

    private String brand;
    private String model;
    private String coolingType;
    private int numberOfFans;
    private double price;
    private double thermalEfficiency;
    private boolean rgbSupport;

    public coolingSystem(String brand, String model, String coolingType, int numberOfFans, double price, double thermalEfficiency, boolean rgbSupport) {
        this.brand = brand;
        this.model = model;
        setCoolingType(coolingType);
        this.numberOfFans = numberOfFans;
        this.price = price;
        this.thermalEfficiency = thermalEfficiency;
        this.rgbSupport = rgbSupport;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getCoolingType() {
        return this.coolingType;
    }

    @Override
    public int getNumberOfFans() {
        return this.numberOfFans;
    }

    @Override
    public double getThermalEfficiency() {
        return thermalEfficiency;
    }

    @Override
    public boolean getRGB() {
        return this.rgbSupport;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
    public void setCoolingType(String coolingType) {
        if(!coolingType.equalsIgnoreCase("AIR") && !coolingType.equalsIgnoreCase("LIQUID") && !coolingType.equalsIgnoreCase("PASSIVE")){
            throw new IllegalArgumentException("Unsupported cooling type.");
        }
        this.coolingType = coolingType;
        //  AIR, LIQUID, PASSIVE
    }
}
