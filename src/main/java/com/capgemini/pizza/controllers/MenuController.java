package com.capgemini.pizza.controllers;

import com.capgemini.pizza.models.Menu;
import com.capgemini.pizza.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @PostMapping("/create")
    public ResponseEntity<Menu> createMenu(@RequestBody Menu menu){

        System.out.println(menu);

        Menu menu1 = menuService.createMenu(menu);
        return new ResponseEntity<>(menu1, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Menu>> getAll(){

        List<Menu> menuItems = menuService.getAll();

        return new ResponseEntity<List<Menu>>(menuItems, HttpStatus.OK);
    }


}
