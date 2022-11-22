package com.ftn.isa22.users.domain;

import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.users.domain.enums.Gender;
import com.ftn.isa22.users.domain.enums.Role;

import java.time.LocalDate;

public class SysAdmin extends User {
    private Long id;

    public SysAdmin() {}

    public SysAdmin(Long id) {
        this.id = id;
    }

    public SysAdmin(String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role, Long id) {
        super(name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
