package com.mytests.springboot.actuator.multimod.mod2;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/20/2017.
 * Project: multimodule-actuator-test0
 * *******************************
 */
@Component
@Endpoint(id = "customEndpoint")
public class MyEndpoint1 {

    @ReadOperation
    public String returnSmth(){
        return "this is my custom endpoint";
    }
}
