package com.capgemini.pizza.service;

import com.capgemini.pizza.dao.MenuDao;
import com.capgemini.pizza.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService implements iMenu {

    @Autowired
    private MenuDao menuDao;

    @Override
    public Menu createMenu(Menu menu) {
        return menuDao.save(menu);
    }

    @Override
    public Menu getMenu(Long id) {
        return menuDao.findById(id).get();
    }

    @Override
    public List<Menu> getAll() {
        return menuDao.findAll();
    }
}
