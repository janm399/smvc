package uk.org.jug.smvc.helloworld;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author janm
 */
@Component("greeter")
public class StdoutGreeter implements Greeter {
    private GreetingSource greetingSource;

    @Autowired
    public StdoutGreeter(GreetingSource greetingSource) {
        this.greetingSource = greetingSource;
    }

    public void greet() {
        System.out.println(this.greetingSource.getGreeting());
    }
}
