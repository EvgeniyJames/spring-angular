package com.insart.springangular.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * User: Evgeniy James
 * Date: 09.03.2015
 */
@Controller
public class GuiController {

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
