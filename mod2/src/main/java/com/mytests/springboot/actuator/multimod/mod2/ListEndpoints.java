package com.mytests.springboot.actuator.multimod.mod2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/20/2017.
 * Project: multimodule-actuator-test0
 * *******************************
 */
@Endpoint(id = "listendpoints")
public class ListEndpoints {


    @Autowired
    private ApplicationContext ctx;

    @ReadOperation
    public String[] returnEndpoints(){

        String[] endpoints = ctx.getBeanNamesForAnnotation(Endpoint.class);
        return endpoints;
    }
    @ReadOperation
    public List<String> returnEndpointsByName(@Selector String pattern){
        String[] endpoints = ctx.getBeanNamesForAnnotation(Endpoint.class);
        List<String> foundResults = new ArrayList<>();
        for (int i = 0; i < endpoints.length; i++) {
            String endpoint = endpoints[i];
            if(endpoint.startsWith(pattern)){foundResults.add(endpoint);}
        }
        return foundResults;
    }
}
