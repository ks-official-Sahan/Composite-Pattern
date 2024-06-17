package ewision.sahan.composite.model;

import ewision.sahan.composite.architecture.Product;

/**
 *
 * @author ksoff
 */
public class Bottle extends Product{

    public Bottle(String title, double price) {
        super(title, price);
    }
    
    @Override
    public double calculate() {
        return getPrice();
    }
    
}
