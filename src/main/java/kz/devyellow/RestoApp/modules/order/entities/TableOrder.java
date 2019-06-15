package kz.devyellow.RestoApp.modules.order.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "table_order")
public class TableOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private int tableNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date creationDateTime;

    @OneToMany(mappedBy = "tableOrder")
    @Getter
    @Setter
    private List<RestoUser> customers = new ArrayList<>();


}
