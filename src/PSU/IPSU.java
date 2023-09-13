package PSU;

import java.util.List;

public interface IPSU {
    String getModel();
    double getPrice();
    int getPower();
    String getType();
    String getCertificateType();
    List<String> getConnectors();

}
