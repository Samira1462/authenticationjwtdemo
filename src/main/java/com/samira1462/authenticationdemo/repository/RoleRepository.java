package com.samira1462.authenticationdemo.repository;

import com.samira1462.authenticationdemo.entity.Role;
import com.samira1462.authenticationdemo.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
//    Optional<Role> findByName(RoleName roleName);
    Role findByName(RoleName roleName);
}
