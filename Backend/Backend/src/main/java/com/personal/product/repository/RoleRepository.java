package com.personal.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.product.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>
{

}
