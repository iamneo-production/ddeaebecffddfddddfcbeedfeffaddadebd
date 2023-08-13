package demo;

import org.junit.Test;

public class AppTest {
    App app = new App();

    @Test
    public void testSetup() {
        app.setup("chrome");
    }

    @Test
    public void testCountLinks() {
        int count = app.countLinks();
        System.out.println("Number of links on the page: " + count);
    }

    @Test
    public void testPrintLinks() {
        app.printLinks();
    }
}
