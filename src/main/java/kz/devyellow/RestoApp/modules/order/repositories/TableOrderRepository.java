package kz.devyellow.RestoApp.modules.order.repositories;

import kz.devyellow.RestoApp.modules.menu.entity.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOrderRepository extends CrudRepository<Food, Long> {
}
