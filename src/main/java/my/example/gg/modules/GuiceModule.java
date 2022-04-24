package my.example.gg.modules;

import com.google.inject.AbstractModule;
import my.example.gg.pages.AppPage;
import my.example.gg.pages.AppPageImpl;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AppPage.class).to(AppPageImpl.class);
    }
}
