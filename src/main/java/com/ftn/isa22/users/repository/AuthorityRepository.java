package com.ftn.isa22.users.repository;

import com.ftn.isa22.users.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
