import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import outsidescope.NonBean;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext( Config.class ) ;
        Arrays.stream( context.getBeanDefinitionNames() ).forEach( System.out::println );
        NonBean nonBean = new NonBean();
        nonBean.getController().print();
    }

}
