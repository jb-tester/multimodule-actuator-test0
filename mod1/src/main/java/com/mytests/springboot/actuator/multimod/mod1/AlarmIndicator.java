package com.mytests.springboot.actuator.multimod.mod1;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/19/2017.
 * Project: multimodule-actuator-test0
 * *******************************
 */
@Component
public class AlarmIndicator implements HealthIndicator {
    private int errorCode = 0;

    @Override
    public Health health() {
        if (errorCode != 0) {
            return Health.down().withDetail("something is wrong ", errorCode).build();
        }
        return Health.up().withDetail("everything is fine ", errorCode).build();
    }
}
