package my.example.gg;

import com.google.inject.Guice;
import com.google.inject.Injector;
import my.example.gg.modules.GuiceModule;
import my.example.gg.steps.InitialSteps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StepTest {

    @Test
    public void testHelloWorld() {
        Injector injector = Guice.createInjector(new GuiceModule());
        InitialSteps steps = injector.getInstance(InitialSteps.class);
        assertNotNull(steps);

        String hello = steps.getHelloWorld();
        assertEquals(hello, "Hello World!!!");

        System.out.println(hello);
    }
}
