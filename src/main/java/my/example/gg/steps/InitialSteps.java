package my.example.gg.steps;

import my.example.gg.pages.AppPage;
import com.google.inject.Inject;

public class InitialSteps {
    private final AppPage page;

    @Inject
    public InitialSteps(AppPage page) {
        this.page = page;
    }

    public String getHelloWorld() { return page.getHelloWorld();}
}
