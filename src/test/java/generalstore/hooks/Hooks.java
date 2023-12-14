package generalstore.hooks;

import generalstore.utils.ConfigReader;
import generalstore.utils.Driver;
import io.cucumber.java.*;


public class Hooks {
    @BeforeAll
    public void beforeAll() {
        Driver.serverBaslat(ConfigReader.getProperty("localIPAdres"), Integer.parseInt(ConfigReader.getProperty("localPort")));
    }

//    @Before
//    public void setUp() {
//    }

    @After
    public void tearDown() {
        Driver.uygulamayiKapat();

    }

    @AfterAll
    public void afterAll() {
        Driver.serverKapat();
    }
}
