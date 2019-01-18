package com.example.pokusaj100.service.mapper;

import com.example.pokusaj100.entity.User;
import com.example.pokusaj100.service.dto.UserDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    User toEntity(UserDTO userDTO);
    UserDTO toDTO(User user);
}
