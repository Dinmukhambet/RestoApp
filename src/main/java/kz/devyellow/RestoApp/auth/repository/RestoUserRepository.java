package kz.devyellow.RestoApp.auth.repository;

import kz.devyellow.RestoApp.auth.entity.RestoUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestoUserRepository extends JpaRepository<RestoUser, Long> {

     RestoUser findByLogin(String login);

}
