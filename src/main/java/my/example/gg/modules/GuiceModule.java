package my.example.gg.modules;

import com.google.inject.AbstractModule;
import my.example.gg.pages.Calculator;
import my.example.gg.pages.CalculatorImpl;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Calculator.class).to(CalculatorImpl.class);
    }
}
