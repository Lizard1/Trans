package hibernate.controller;

import hibernate.service.serv.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import hibernate.model.User;
import hibernate.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService UserService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allUsers() {
        List<User> users = UserService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("usersList", users);
        return modelAndView;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView user(@PathVariable("id") int id) {
        User user = UserService.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("oneUser", user);
        return modelAndView;
    }
}
