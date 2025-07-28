package org.jboss.as.quickstarts.helloworld;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldService {
    public String createHelloMessage() {
        return "Hello from a minimal JBoss Application!";
    }
}
