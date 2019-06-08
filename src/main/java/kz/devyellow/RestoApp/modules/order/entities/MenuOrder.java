package kz.devyellow.RestoApp.modules.order.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import kz.devyellow.RestoApp.modules.menu.entity.MenuItem;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class MenuOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private List<MenuItem> items;

    private RestoUser customer;

    private int tableNumberId;


    //region getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

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
