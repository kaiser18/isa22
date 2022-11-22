package com.ftn.isa22.users.repository;

import com.ftn.isa22.users.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
