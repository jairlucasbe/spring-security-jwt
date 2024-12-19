package com.example.securityjwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.securityjwt.models.RoleEntity;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Long> {

}
