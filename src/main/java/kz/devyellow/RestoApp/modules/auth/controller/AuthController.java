package kz.devyellow.RestoApp.modules.auth.controller;

import kz.devyellow.RestoApp.modules.auth.RestoUserDto;
import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import kz.devyellow.RestoApp.modules.auth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("user/registration")
    public RestoUser saveEvent(@RequestBody RestoUser user) {
        return userService.saveUser(user);
    }

    @GetMapping("hello")
    public String getCalendarByYear() {
        return "helloss";
    }

    @PostMapping("user/authorization")
    public HashMap<String,Object> auth(@RequestBody RestoUserDto user) {
        return userService.findByLogin(user);
    }
}
