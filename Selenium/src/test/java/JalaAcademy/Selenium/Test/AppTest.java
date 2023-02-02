package JalaAcademy.Selenium.Test;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

import static org.testng.Assert.assertTrue;

public class AppTest {
    public AppTest(String testName)
    {
        super();
    }
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
