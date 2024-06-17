package ewision.sahan.composite.model;

import ewision.sahan.composite.architecture.Box;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ksoff
 */
public class CompositeBox implements Box {

    private final ArrayList<Box> elements = new ArrayList<>();

    public CompositeBox(Box ...boxes) {
        elements.addAll(
                Arrays.asList(boxes)
        );
    }
    
    @Override
    public double calculate() {
        return elements.stream().mapToDouble(Box::calculate).sum();
    }
    
}
