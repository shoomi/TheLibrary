package com.somecuitears;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home")     // тут лапається /home запит
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");   // home.jsp (аналог html сторінки) вставляється в контролер
        modelAndView.addObject("pageTitle", "Home Page");  // тут заповнюється даними
        modelAndView.addObject("message", "Hi, Welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/anotherpage")
    public ModelAndView anotherPage() {
        ModelAndView modelAndView = new ModelAndView("anotherpage");
        return modelAndView;
    }

}
