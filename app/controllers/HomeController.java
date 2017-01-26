package controllers;

import com.google.common.eventbus.EventBus;
import commands.AddValueCommand;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DataService;

import javax.inject.Inject;

public class HomeController extends Controller {

    private final DataService service;
    private final EventBus bus;

    @Inject
    public HomeController(DataService service, EventBus bus) {
        this.service = service;
        this.bus = bus;
    }

    public Result list() {
        return ok(Json.toJson(service.getAll()));
    }

    public Result add(String value) {
        bus.post(new AddValueCommand(value));
        return redirect("/");
    }

}
