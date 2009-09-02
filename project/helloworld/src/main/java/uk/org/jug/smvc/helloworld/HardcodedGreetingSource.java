package uk.org.jug.smvc.helloworld;

import org.springframework.stereotype.Component;

/**
 * @author janm
 */
@Component
public class HardcodedGreetingSource implements GreetingSource {
    public String getGreeting() {
        return "Hello, World";
    }
}
