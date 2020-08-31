import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import outsidescope.NonBean;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( Config.class ) ;
        NonBean nonBean = new NonBean();
        nonBean.getController().print();
    }

}
