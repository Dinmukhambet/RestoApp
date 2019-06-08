package kz.devyellow.RestoApp.modules.order.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TableOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int tableNumber;

    private RestoUser customer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;


    //region getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public RestoUser getCustomer() {
        return customer;
    }

    public void setCustomer(RestoUser customer) {
        this.customer = customer;
    }

    public Date getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
    //endregion
}
