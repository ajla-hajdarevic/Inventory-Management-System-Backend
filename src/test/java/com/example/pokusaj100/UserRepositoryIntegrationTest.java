package com.example.pokusaj100;

import com.example.pokusaj100.entity.User;
import com.example.pokusaj100.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class UserRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void whenGetByName_thenReturnUser(){

        User user = new User("blah", "ajla@gmail.com", "blah2");
        entityManager.persist(user);
        entityManager.flush();

        User found =userRepository.getByUsername(user.getUsername());

        assertEquals(found.getUsername(), user.getUsername());
    }
}
