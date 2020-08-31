package outsidescope;

import controllers.IController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class NonBean {
    @Autowired
    private IController controller;

    public IController getController() {
        return controller;
    }
}
