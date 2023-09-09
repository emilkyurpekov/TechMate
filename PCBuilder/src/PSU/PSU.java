package PSU;

import java.util.ArrayList;
import java.util.List;

public class PSU implements IPSU{
     private String model;
     private int power;


    private String type;


    private String certificateType;
     private  List<String> connectors;

    public PSU(String model, int power, String type, String certificateType, List<String> connectors) {
        this.model = model;
        setPower(power);
        setType(type);
        setCertificateType(certificateType);
        this.connectors = new ArrayList<>();
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getCertificateType() {
        return this.certificateType;
    }

    @Override
    public List<String> getConnectors() {
        return this.connectors;
    }
    public void addConnector(String connector){
        this.connectors.add(connector);
    }
    public void setType(String type) {
        if(!type.equals("Modular") && !type.equals("Non-Modular") && !type.equals("Semi-Modular")){
            throw new IllegalArgumentException("Unsupported PSU type");
        }
        this.type = type;
    }

    public void setPower(int power) {
        if (power < 450 ) {
            throw new IllegalArgumentException("Power cannot be less than 450W.");

        }
        else if(power>1600){
            throw new IllegalArgumentException("Power cannot be more than 1600W.");
        }
        this.power = power;
    }
    public void setCertificateType(String certificateType) {
        if(!certificateType.equals("Bronze") && !certificateType.equals("Silver") && !certificateType.equals("Gold")){
            throw new IllegalArgumentException("Type cannot differ from Silver, Bronze or Gold.");
        }
        this.certificateType = certificateType;
    }

}
