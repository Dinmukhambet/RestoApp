package kz.devyellow.RestoApp.modules.order.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Getter
    @Setter
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate reservationTime;

    @OneToMany(mappedBy = "tableOrder")
    @Getter
    @Setter
    private List<RestoUser> customers = new ArrayList<>();

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
//        date.plus()

    }
}
