package com.example.pokusaj100;
import com.example.pokusaj100.entity.Role;
import com.example.pokusaj100.entity.RoleName;
import com.example.pokusaj100.repository.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RoleRepositoryIntegrationTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private RoleRepository roleRepository;


    @Test
    public void whenGetByName_thenReturnRole() {
        // given
        Role role = new Role(RoleName.ROLE_ADMIN);
        entityManager.persist(role);
        entityManager.flush();

        // when
        Role found = roleRepository.getByName(RoleName.ROLE_ADMIN);

        // then

        assertEquals(found.getName(), role.getName());
    }

}