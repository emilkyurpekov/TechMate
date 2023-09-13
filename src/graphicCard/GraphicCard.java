package graphicCard;

import java.util.ArrayList;
import java.util.List;

public class GraphicCard implements IGraphicCard {
    private String manufacturer;

    public GraphicCard(String manufacturer, String model, String splint, int memory, String memoryType) {
        setManufacturer(manufacturer);
        this.model = model;
        this.splint = splint;
        this.memory = memory;
        setMemoryType(memoryType);
        this.ports = new ArrayList<>();
    }

    private String model;
    private String splint;
    private int memory;
    private String memoryType;
    private List<String> ports;

    @Override
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getSplint() {
        return this.splint;
    }

    @Override
    public int memory() {
        return this.memory;
    }

    @Override
    public String memoryType() {
        return memoryType;
    }

    @Override
    public List<String> getPorts() {
        return this.ports;
    }
    public void addPorts(String ports){
        this.ports.add(ports);
    }
    public void setManufacturer(String manufacturer)throws IllegalArgumentException {
        if(!manufacturer.equals("NVIDIA") && !manufacturer.equals("AMD")){
            throw new IllegalArgumentException("Unsupported video card manufacturer");
        }
        this.manufacturer = manufacturer;
    }

    public void setMemoryType(String memoryType) throws IllegalArgumentException{
        if (memoryType.equals("GDDR4") || memoryType.equals("GDDR5") || memoryType.equals("GDDR6") || memoryType.equals("HBM")) {
            this.memoryType = memoryType;
            return;
        }
        throw new IllegalArgumentException("Unsupported memory format");

    }
}
