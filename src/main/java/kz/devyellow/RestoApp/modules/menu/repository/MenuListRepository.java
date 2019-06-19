package kz.devyellow.RestoApp.modules.menu.repository;

import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuListRepository extends JpaRepository<MenuItem, Long> {

	List<MenuItem> findByNominationContaining(String name);




}
