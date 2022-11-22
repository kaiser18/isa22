package com.ftn.isa22.users.domain;

import com.ftn.isa22.bloodbank.domain.BloodBank;
import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.users.domain.enums.Gender;
import com.ftn.isa22.users.domain.enums.Role;

import java.time.LocalDate;

public class BloodBankAdmin extends User {
    private Long id;
    private BloodBank bloodBank;

    public BloodBankAdmin() {}

    public BloodBankAdmin(Long id, BloodBank bloodBank) {
        this.id = id;
        this.bloodBank = bloodBank;
    }

    public BloodBankAdmin(String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role, BloodBank bloodBank) {
        super(name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
        this.bloodBank = bloodBank;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }
}
