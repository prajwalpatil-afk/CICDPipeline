import org.testng.Assert;
import org.testng.annotations.Test;

public class WebsiteTest {

    @Test
    public void simpleTest() {

        String pageTitle = "Example Domain";

        System.out.println("Running Selenium Test Simulation");

        Assert.assertTrue(pageTitle.contains("Example"));

    }

}