package com.ftn.isa22.users.repository;

import com.ftn.isa22.users.domain.SysAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysAdminRepository extends JpaRepository<SysAdmin, Long> {
}
