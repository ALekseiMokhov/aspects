import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@ComponentScan (basePackages = {"controllers","outsidescope"})
@EnableSpringConfigured
public class Config {
}
