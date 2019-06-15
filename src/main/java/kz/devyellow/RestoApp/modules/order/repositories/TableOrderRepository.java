package kz.devyellow.RestoApp.modules.order.repositories;

import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface TableOrderRepository extends CrudRepository<MenuItem, Long> {
}
