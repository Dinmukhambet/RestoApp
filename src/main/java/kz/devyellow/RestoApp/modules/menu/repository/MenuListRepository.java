package kz.devyellow.RestoApp.modules.menu.repository;

import kz.devyellow.RestoApp.modules.menu.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuListRepository extends JpaRepository<Food, Long> {

	List<Food> findByNominationContaining(String name);




}
