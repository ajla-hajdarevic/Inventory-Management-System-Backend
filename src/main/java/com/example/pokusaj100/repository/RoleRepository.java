package com.example.pokusaj100.repository;

import com.example.pokusaj100.entity.Role;
import com.example.pokusaj100.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
    Role getByName(RoleName name);
}
