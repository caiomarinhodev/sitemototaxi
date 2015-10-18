import play.Application;
import play.GlobalSettings;
import play.Logger;

/**
 * Created by caio on 24/03/15.
 */

public class Global extends GlobalSettings {


    @Override
    public void onStart(Application app) {
        Logger.info("inicializada...");

    }

    public void onStop(Application app) {
        Logger.info("desligada...");
    }

}
