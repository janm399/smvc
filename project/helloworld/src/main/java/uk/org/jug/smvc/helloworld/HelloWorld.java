package uk.org.jug.smvc.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author janm
 */
public class HelloWorld {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/META-INF/spring/module-context.xml");
        Greeter greeter = applicationContext.getBean("greeter", Greeter.class);
        greeter.greet();
    }

}
