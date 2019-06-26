package kz.devyellow.RestoApp.modules.auth.services;

import kz.devyellow.RestoApp.modules.auth.RestoUserDto;
import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import kz.devyellow.RestoApp.modules.auth.repository.RestoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestoUserRepository userRepository;

    public HashMap<String, Object> findByLogin(RestoUserDto user) {
        HashMap<String, Object> objects = new HashMap<>();
        RestoUser restoUser = userRepository.findByLogin(user.getLogin());
        if (restoUser.getPassword().equals(user.getPassword())) {
            objects.put("message", "signed_user");
            objects.put("user", restoUser);
        } else {
            objects.put("message", "alien");
        }
        return objects;
    }

    @Transactional
    public RestoUser saveUser(RestoUser user) {
        RestoUser restoUser = null;
        List<RestoUser> users = userRepository.findAll();

        /**
         * проверка на одинаковый логин
         */
        boolean hasSameLogin = users.stream().noneMatch(u -> u.getLogin().equals(user.getLogin()));
        if (hasSameLogin) {
            restoUser = userRepository.save(user);
        }
            return restoUser;
    }
}
