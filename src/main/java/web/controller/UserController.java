package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", userService.listUsers());
        return "users";
    }

    @PostMapping("/add")
    public String create(@RequestParam String firstName,
                         @RequestParam String lastName,
                         @RequestParam String email) {
        userService.add(new User(firstName, lastName, email));
        return "redirect:/users";
    }

    @PostMapping("/edit")
    public String edit(@RequestParam String id,
                       @RequestParam(required = false) String firstName,
                       @RequestParam(required = false) String lastName,
                       @RequestParam(required = false) String email) {
        userService.update(new User(Long.parseLong(id), firstName, lastName, email));
        return "redirect:/users";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam Long id) {
        userService.delete(id);
        return "redirect:/users";
    }
}