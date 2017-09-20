package com.mytests.springboot.actuator.multimod.mod1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/18/2017.
 * Project: multimodule-actuator-test0
 * *******************************
 */
@Controller
public class Mod1Controller1 {

    private final AtomicLong counter = new AtomicLong();
    @RequestMapping("/mod1_home")
    public String mod1_homeMethod(ModelMap model) {
        model.addAttribute("mod1_home_attr1", "mod1: home view");
        model.addAttribute("counter", counter.incrementAndGet());
        return "mod1_home";
    }
}
