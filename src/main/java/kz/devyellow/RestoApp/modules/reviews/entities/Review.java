package kz.devyellow.RestoApp.modules.reviews.entities;

import kz.devyellow.RestoApp.modules.auth.entity.RestoUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;


    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    @OneToOne()
    private RestoUser user;

}
