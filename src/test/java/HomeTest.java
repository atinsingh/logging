import org.junit.BeforeClass;

import java.util.logging.Logger;

public class HomeTest {
    private static Logger logger = Logger.getLogger("HomeTest");

    @BeforeClass
    public static void setUp2() {
        logger.info("Running Before Class");
    }
}
