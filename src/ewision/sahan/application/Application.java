package ewision.sahan.application;

import ewision.sahan.composite.InitializeComposite;
import ewision.sahan.no_composite.InitializeNoComposite;

/**
 *
 * @author ksoff
 */
public class Application {

    public static void main(String[] args) {
        
        System.out.println("Composite");
        InitializeComposite.init();

        System.out.println("No-Composite");
        InitializeNoComposite.init();

    }

}
