package com.mimacom.app.springboot.web;

import com.mimacom.app.springboot.domain.User;
import com.mimacom.app.springboot.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void addRandom() {
        User user = new User();
        user.setName("TEST-NAME");
        userRepository.save(user);
    }
}
