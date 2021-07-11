package com.eshop.admin.user;

import com.eshop.entity.Role;
import com.eshop.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(value = false)
public class UserRepositoryTests {

    @Autowired
    private  UserRepository repository;

    @Test
    public void testCreateFirstRole(){

        User user  = new User();
        user.setEmail("abc@abc");
        user.setPassword("123");
        user.setFirstName("Joshi");
        user.setLastName("Bon");
        user.setEnable(1);
        User savedUser =  repository.save(user);
        assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testCreateOrtherRole(){

    }
}
