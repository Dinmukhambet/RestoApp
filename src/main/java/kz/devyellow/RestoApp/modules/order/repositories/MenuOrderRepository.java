package kz.devyellow.RestoApp.modules.order.repositories;

import kz.devyellow.RestoApp.modules.order.entities.MenuOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuOrderRepository extends JpaRepository<MenuOrder, Long> {
}
