package my.example.gg;

import com.google.inject.Guice;
import com.google.inject.Injector;
import my.example.gg.modules.GuiceModule;
import my.example.gg.steps.CalculatorSteps;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        Injector injector = Guice.createInjector(new GuiceModule());
        CalculatorSteps steps = injector.getInstance(CalculatorSteps.class);
        assertNotNull(steps);

        int total = steps.assertAdd();
        System.out.println(total);
    }
}
