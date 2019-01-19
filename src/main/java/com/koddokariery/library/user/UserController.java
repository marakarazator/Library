package com.koddokariery.library.user;

import com.koddokariery.library.user.web.CreateUserDto;
import com.koddokariery.library.user.web.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserResponse> getAllUsers() {
        return userService.getAll();
    }

    @PostMapping
    public void addUser(@RequestBody CreateUserDto createUserDto){
        userService.addUser(createUserDto);
    }

}
