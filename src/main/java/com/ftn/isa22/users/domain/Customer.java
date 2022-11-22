package com.ftn.isa22.users.domain;

import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.users.domain.enums.Gender;
import com.ftn.isa22.users.domain.enums.Role;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customers")
@DiscriminatorValue(value = Role.Values.Customer)
public class Customer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String profession;
    private String professionInfo;
    private boolean enabled;
    private String verificationCode;

    public Customer() {}

    public Customer(Long id, String profession, String professionInfo) {
        this.id = id;
        this.profession = profession;
        this.professionInfo = professionInfo;
    }

   /* public Customer(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role) {
        super(id, name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
    }

    public Customer(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role, String profession, String professionInfo) {
        super(id, name, surname, jmbg, dateOfBirth, address, gender, phoneNumber, email, password, role);
        this.profession = profession;
        this.professionInfo = professionInfo;
    } */

    public Customer(Long id, boolean enabled, String verificationCode) {
        this.id = id;
        this.enabled = enabled;
        this.verificationCode = verificationCode;
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

    public boolean getEnabled(){
        return this.enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verification_code) {
        this.verificationCode = verification_code;
    }

    @Override
    public String getUsername() {
        return getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
