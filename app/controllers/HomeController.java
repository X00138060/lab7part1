package controllers;

import play.mvc.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result about() {
        return ok(views.html.about.render());
    }

    public Result products() {
        return ok(views.html.products.render());
    }

}
