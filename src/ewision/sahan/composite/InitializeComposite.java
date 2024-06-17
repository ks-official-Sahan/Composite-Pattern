package ewision.sahan.composite;

import ewision.sahan.composite.model.Bottle;
import ewision.sahan.composite.model.CompositeBox;
import ewision.sahan.composite.services.AppService;

/**
 *
 * @author ksoff
 */
public class InitializeComposite {

    public static void init() {
        //System.out.println("Composite");

        AppService appService = new AppService();

        appService.wrapUpOrder(new CompositeBox(
                    new Bottle("Title 1", 1000)
                ), 
                new CompositeBox(
                    new CompositeBox(new Bottle("Title 2", 500))
                ),
                new Bottle("Title 3", 750)
        );
        
        double total = appService.calculateTotal();
        System.out.println(total);
    }

}
