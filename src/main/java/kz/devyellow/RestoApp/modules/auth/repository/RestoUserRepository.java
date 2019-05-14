package kz.devyellow.RestoApp.modules.auth.repository;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestoUserRepository extends JpaRepository<RestoUser, Long> {

     RestoUser findByLogin(String login);

}
