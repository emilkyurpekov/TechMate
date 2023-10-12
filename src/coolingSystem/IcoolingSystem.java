package coolingSystem;

public interface IcoolingSystem {
    String getModel();
    String getCoolingType();
    int getNumberOfFans();
    double getThermalEfficiency();
    boolean getRGB();
    double getPrice();
}
//private String brand;
//    private String model;
//    private CoolingType type;
//    private int numberOfFans; // Relevant mostly for air and some liquid coolers
//    private double price;
//    private double thermalEfficiency; // Some metric (e.g., TDP) to represent cooling capacity
//    private boolean rgbSupport; // For users who want aesthetics