package kz.devyellow.RestoApp.auth.services;

import kz.devyellow.RestoApp.auth.entity.RestoUser;
import kz.devyellow.RestoApp.auth.repository.RestoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RestoUserRepository userRepository;

    public RestoUser findByLogin(String login) {
       return userRepository.findByLogin("login");
    }

    public RestoUser saveUser(RestoUser user) {
        return userRepository.save(user);
    }
}
