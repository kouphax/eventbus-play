import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import handlers.AddValueHandler;
import services.DataService;

import java.util.concurrent.Executors;

public class Module extends AbstractModule {

    @Override
    public void configure() {

        EventBus bus = new AsyncEventBus(Executors.newSingleThreadExecutor());

        bind(EventBus.class).toInstance(bus);
        bind(DataService.class).asEagerSingleton();
        bind(AddValueHandler.class).asEagerSingleton();
    }

}
