package com.mytests.springboot.actuator.multimod.mod1;

import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class ListEndPoints extends AbstractEndpoint{
    private List endpoints;

    public ListEndPoints(List<Endpoint> endpoints) {
        super("showendpoints");
        this.endpoints = endpoints;
    }

    @Override
    public List invoke() {
        return this.endpoints;
    }
}