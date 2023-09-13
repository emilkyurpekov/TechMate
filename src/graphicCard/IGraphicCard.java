package graphicCard;

import java.util.List;

public interface IGraphicCard {
    String getManufacturer();
    String getModel();
    String getSplint();
    int memory();
    String memoryType();
    List<String> getPorts();
    double getPrice();
}
