package my.example.gg;

import com.google.inject.Guice;
import com.google.inject.Injector;
import my.example.gg.modules.GuiceModule;
import my.example.gg.steps.InitialRegistrationSteps;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        Injector injector = Guice.createInjector(new GuiceModule());
        InitialRegistrationSteps steps = injector.getInstance(InitialRegistrationSteps.class);
        assertNotNull(steps);

        int total = steps.add();
        assertEquals(total, 2 + 3);

        System.out.println(total);
    }
}
