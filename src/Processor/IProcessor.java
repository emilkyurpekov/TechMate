package Processor;

public interface IProcessor {
    String getModel();
    double getGHz();
    double getTurboBoostGHz();
    String getSocket();
    int getPhysicalCores();
    int getLogicalCores();
    double getPrice();
}
