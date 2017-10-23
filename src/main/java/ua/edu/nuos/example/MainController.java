package ua.edu.nuos.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public ModelAndView hello(@RequestParam String username, @RequestParam int userage){
        UserInfo userInfo = new UserInfo(username, userage);
        return new ModelAndView("hello").addObject(userInfo);
    }
}
