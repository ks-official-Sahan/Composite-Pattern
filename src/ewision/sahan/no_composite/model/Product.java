package ewision.sahan.no_composite.model;

/**
 *
 * @author ksoff
 */
public class Product {

    private String title;
    
    private double cost;

    public Product(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
