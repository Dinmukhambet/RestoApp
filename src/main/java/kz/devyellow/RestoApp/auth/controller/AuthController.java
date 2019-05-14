package kz.devyellow.RestoApp.auth.controller;

import kz.devyellow.RestoApp.auth.RestoUserDto;
import kz.devyellow.RestoApp.auth.entity.RestoUser;
import kz.devyellow.RestoApp.auth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
