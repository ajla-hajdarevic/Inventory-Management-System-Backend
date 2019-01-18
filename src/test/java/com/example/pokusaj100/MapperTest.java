package com.example.pokusaj100;

import com.example.pokusaj100.entity.User;
import com.example.pokusaj100.service.dto.UserDTO;
import com.example.pokusaj100.service.mapper.UserMapperImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class MapperTest {
    UserMapperImpl userMapper;

    @Before
    public void setup() {
        userMapper = new UserMapperImpl();
    }

    @Test
    public void MapperTest() {
        User user  = new User("blah", "ajla@gmail.com", "blah2");
        UserDTO userDTO = userMapper.toDTO(user);

        assertEquals(user.getUsername(), userDTO.getUsername());

    }
}
