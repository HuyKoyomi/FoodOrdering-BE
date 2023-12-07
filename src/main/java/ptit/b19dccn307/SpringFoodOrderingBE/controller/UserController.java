package ptit.b19dccn307.SpringFoodOrderingBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ptit.b19dccn307.SpringFoodOrderingBE.model.User;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.UserRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.UserResponse;
import ptit.b19dccn307.SpringFoodOrderingBE.service.UserService;

import java.util.List;

@RestController
@CrossOrigin("*")
//@RequestMapping("/vnFood")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserResponse create(@RequestBody UserRequest user) {
        return userService.createUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/login")
    public User getAllUser(@RequestParam String account, @RequestParam String password) {
        return userService.getUserLogin(account, password);
    }

}