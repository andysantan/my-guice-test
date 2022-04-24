package my.example.gg.steps;

import my.example.gg.pages.Calculator;
import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private final Calculator page;

    @Inject
    public CalculatorSteps(Calculator page) {
        this.page = page;
    }

    public int assertAdd() {
        int total = page.add(2, 3);
        assertEquals(total, 2 + 3);
        return total;
    }
}
