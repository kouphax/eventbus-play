package handlers;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import commands.AddValueCommand;
import services.DataService;

import javax.inject.Inject;

public class AddValueHandler {

    private final DataService service;

    @Inject
    public AddValueHandler(DataService service, EventBus bus) {
        this.service = service;
        bus.register(this);
    }

    @Subscribe
    public void answerAvailable(AddValueCommand command) throws InterruptedException {
        Thread.sleep(10000L);
        service.add(command.value(), command.value());
    }
}
