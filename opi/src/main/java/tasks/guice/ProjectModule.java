package tasks.guice;

import tasks.guice.provider.WebDriverProvider;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.openqa.selenium.WebDriver;

public final class ProjectModule extends AbstractModule {
    @Override
    public void configure() {
        //I really don't like the fact I have to use Singleton here
        bind(WebDriver.class).toProvider(WebDriverProvider.class).in(Singleton.class);
    }
}
