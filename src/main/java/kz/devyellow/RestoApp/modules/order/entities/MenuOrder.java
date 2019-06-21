package kz.devyellow.RestoApp.modules.order.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import kz.devyellow.RestoApp.modules.menu.entity.Food;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * todo rename menu item to food
 */
@Entity
@Table(name = "menu_order")
public class MenuOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;

    @OneToMany()
    @Getter
    @Setter
    private List<Food> items;

    @OneToOne()
    @Getter
    @Setter
    private RestoUser customer;

    @Getter
    @Setter
    private int tableNumberId;
}
