package com.eshop.admin.user;

import com.eshop.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class RoleRepositoryTests {

    @Autowired
    private  RoleRepository repository;

    @Test
    public void testCreateFirstRole(){

        Role roleAdmin  = new Role("Admin", "manager Everything");
        Role savedRole =  repository.save(roleAdmin);
        assertThat(savedRole.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateOrtherRole(){
        Role sale  = new Role("Sale", "manager product price, customer, shipping, order and sale report");
        Role shipper  = new Role("Shipper", "manager view product, view orders, and update order");
        Role editor  = new Role("Editor", "manage category, brands, products, article and menu");
        Role assistant  = new Role("Assistant", "manager question and reviews");
        repository.saveAll(List.of(sale, shipper, editor, assistant));
    }
}
