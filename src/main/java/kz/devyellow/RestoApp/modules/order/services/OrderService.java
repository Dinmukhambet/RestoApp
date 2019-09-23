package kz.devyellow.RestoApp.modules.order.services;

import kz.devyellow.RestoApp.modules.order.repositories.MenuOrderRepository;
import kz.devyellow.RestoApp.modules.order.repositories.TableOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	TableOrderRepository tableOrderRepository;
	@Autowired
	MenuOrderRepository menuOrderRepository;

	public void getOrderedTimeForTable() {

	}
}
