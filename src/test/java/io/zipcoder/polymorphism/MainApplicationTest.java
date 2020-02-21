package io.zipcoder.polymorphism;

import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    /*
    @Test
    public void mainTest() {

        String input = "1\nDog\nJimmy\n";
        ByteArrayInputStream testIn;
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        MainApplication.main(null);
    }
*/
    @Test
    public void mainTest() {

        String input = "3\nCat\nKitty\nDog\nJimmy\nParrot\nTweety";
        ByteArrayInputStream testIn;
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        MainApplication.main(null);
    }

    /*
    @Test
    public void mainTest() {

        String input = "1\nParrot\nKeater\n";
        ByteArrayInputStream testIn;
        testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
        MainApplication.main(null);
    }*/
}
