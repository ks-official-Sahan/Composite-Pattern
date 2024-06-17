package ewision.sahan.no_composite.model;

import java.util.List;

/**
 *
 * @author ksoff
 */
public class Box {

    private List<Box> boxes;
    
    private List<Product> products;

    public Box(List<Box> boxes, List<Product> products) {
        this.boxes = boxes;
        this.products = products;
    }

    public double calculateCost() {
//        double cost = 0;
//        for (Product product : products) {
//            cost += product.getCost();
//        }

        double cost = products.stream()
                .mapToDouble(
                        Product::getCost
                ).sum();
        
        for (Box box: boxes) {
            cost += box.calculateCost();
        }

        return cost;
    }
    
}
