package com.mongodb.learnings.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.learnings.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

	Role findByRoleNameIgnoreCase(String roleName);

	List<Role> findByRoleNameOrderByGroupIdAsc(String roleName);

	Slice<Role> findByRoleName(String roleName, Pageable pageable);
}
