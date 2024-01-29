package org.csystem.app.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyMample extends Mample{
    public MyMample()
    {
        System.out.println("I am a default ctor of MyMample");
    }
}
