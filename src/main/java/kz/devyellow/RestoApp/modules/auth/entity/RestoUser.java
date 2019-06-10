package kz.devyellow.RestoApp.modules.auth.entity;

import kz.devyellow.RestoApp.modules.order.entities.MenuOrder;

import javax.persistence.*;

@Entity
public class RestoUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String login;

    private String password;

    private String email;

    @OneToOne()
    private MenuOrder order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MenuOrder getOrder() {
        return order;
    }

    public void setOrder(MenuOrder order) {
        this.order = order;
    }
}
