package com.capgemini.pizza.models;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menuid")
    private Long menuId;

    @Column(name = "pizzaId")
    private Long pizzaId;

    public Menu(){

    }

    public Menu(Long menuId, Long pizzaId) {
        this.menuId = menuId;
        this.pizzaId = pizzaId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }


}
