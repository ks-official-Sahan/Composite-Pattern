package ewision.sahan.composite.services;

import ewision.sahan.composite.architecture.Box;
import ewision.sahan.composite.model.CompositeBox;

/**
 *
 * @author ksoff
 */
public class AppService {

    private Box box;
    
    public AppService() {
    }
    
    public void wrapUpOrder(Box ...boxes) {
        this.box = new CompositeBox(boxes);
    }
    
    public double calculateTotal() {
        return box.calculate();
    }
}
