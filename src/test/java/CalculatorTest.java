import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
    private static Calculator calculator;
    private static Logger logger = LogManager.getLogger(CalculatorTest.class);
    @Before
    public void setUp() {
        logger.info("Running Before");

    }

    @BeforeClass
    public static void setUp2() {
        calculator = new Calculator();
       logger.info("Running Before Class");
       logger.error("Dummy Error Simulation");
       logger.fatal("Dummy FATAL Simulation");
       logger.warn("Dummy WARN Simulation");
    }

    @Test
    public void sumTest() {
        Assert.assertEquals(4,calculator.sum(2,2));
    }

    @Test
    public void sumTest2() {
        Assert.assertEquals(4,calculator.sum(2,2));
    }
}
