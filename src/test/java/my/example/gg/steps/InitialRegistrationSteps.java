package my.example.gg.steps;

import my.example.gg.pages.Calculator;
import com.google.inject.Inject;

public class InitialRegistrationSteps {
    private final Calculator page;

    @Inject
    public InitialRegistrationSteps(Calculator page) {
        this.page = page;
    }

    public int add() { return page.add(2, 3);}
}
