package controllers;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.splay;
import views.html.index_mobile;

public class Application extends Controller {

    @Transactional
    public static Result index() {
        return ok(index.render());
    }

    @Transactional
    public static Result index_app(){
        return ok(index_mobile.render());
    }

    @Transactional
    public static Result splay() {
        return ok(splay.render());
    }


}
