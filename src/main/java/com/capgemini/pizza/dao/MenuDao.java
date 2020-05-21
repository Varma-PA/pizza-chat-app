package com.capgemini.pizza.dao;


import com.capgemini.pizza.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDao extends JpaRepository<Menu, Long> {
}
