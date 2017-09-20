package com.mytests.springboot.actuator.multimod.mod2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 9/18/2017.
 * Project: multimodule-actuator-test0
 * *******************************
 */
@Controller
public class Mod2Controller1 {
    @RequestMapping("/mod2_home")
    public String mod2_homeMethod(ModelMap model) {
        model.addAttribute("mod2_home_attr1", "mod2: home view");
        return "mod2_home";
    }
}
