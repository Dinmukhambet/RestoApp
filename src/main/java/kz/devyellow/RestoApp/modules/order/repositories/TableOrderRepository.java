package kz.devyellow.RestoApp.modules.order.repositories;

import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableOrderRepository extends JpaRepository<MenuItem, Long> {
}
