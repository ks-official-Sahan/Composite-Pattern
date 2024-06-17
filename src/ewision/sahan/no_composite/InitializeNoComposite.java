package ewision.sahan.no_composite;

import ewision.sahan.no_composite.model.Box;
import ewision.sahan.no_composite.model.Product;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ksoff
 */
public class InitializeNoComposite {

    public static void init() {
        //System.out.println("No Composite");

        Box box = new Box(Arrays.asList(
                new Box(Collections.EMPTY_LIST,
                        Arrays.asList(
                                new Product("Book", 20),
                                new Product("Laptop", 40000))),
                new Box(Collections.EMPTY_LIST,
                        Collections.EMPTY_LIST)
                ),
                Arrays.asList(
                        new Product("mobile", 20000),
                        new Product("mobile", 24000)
                )
        );

    }

}
