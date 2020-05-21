package com.capgemini.pizza.service;

import com.capgemini.pizza.models.Menu;

import java.util.List;

public interface iMenu {

    Menu createMenu(Menu menu);

    Menu getMenu(Long id);

    List<Menu> getAll();

}
