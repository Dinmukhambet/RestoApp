package kz.devyellow.RestoApp.modules.order.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "menu_order")
public class MenuOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

//    private List<MenuItem> items;

    @OneToOne(optional = false ,fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private RestoUser customer;

    private int tableNumberId;


    //region getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

 /*   public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }*/

    public RestoUser getCustomer() {
        return customer;
    }

    public void setCustomer(RestoUser customer) {
        this.customer = customer;
    }

    public int getTableNumberId() {
        return tableNumberId;
    }

    public void setTableNumberId(int tableNumberId) {
        this.tableNumberId = tableNumberId;
    }
    //endregion
}
