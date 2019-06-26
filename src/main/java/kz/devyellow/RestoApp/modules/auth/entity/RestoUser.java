package kz.devyellow.RestoApp.modules.auth.entity;

import kz.devyellow.RestoApp.modules.order.entities.MenuOrder;
import kz.devyellow.RestoApp.modules.order.entities.TableOrder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class RestoUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Integer id;
	@Getter
	@Setter
	private String login;
	@Getter
	@Setter
	private String fullName;
	@Getter
	@Setter
	private String password;
	@Getter
	@Setter
	private String email;
	@Getter
	@Setter
	private String status;
	@OneToOne()
	@Getter
	@Setter
	private MenuOrder order;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "table_order_id")
	@Getter
	@Setter
	private TableOrder tableOrder;
}
