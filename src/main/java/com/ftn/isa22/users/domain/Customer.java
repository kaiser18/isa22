package com.ftn.isa22.users.domain;

import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.users.domain.enums.Gender;
import com.ftn.isa22.users.domain.enums.Role;

import java.time.LocalDate;

public class Customer extends User{
    private Long id;
    private String profession;
    private String professionInfo;

    public Customer() {}

    public Customer(Long id, String profession, String professionInfo) {
        this.id = id;
        this.profession = profession;
        this.professionInfo = professionInfo;
    }

    public Customer(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role) {
        super(id, name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
    }

    public Customer(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role, String profession, String professionInfo) {
        super(id, name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
        this.profession = profession;
        this.professionInfo = professionInfo;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfessionInfo() {
        return professionInfo;
    }

    public void setProfessionInfo(String professionInfo) {
        this.professionInfo = professionInfo;
    }
}
