package com.ftn.isa22.users.domain;

import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.users.domain.enums.Gender;
import com.ftn.isa22.users.domain.enums.Role;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private String surname;
    private String jmbg;
    private LocalDate dateOfBirth;
    private Address address;
    private Gender gender;
    private String phoneNumber;
    private String email;
    private String password;
    private Role role;

    public User() {}

    public User(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User(String name, String surname, String jmbg, LocalDate dateOfBirth, Address address, Gender gender, String phoneNumber, String email, String password, Role role) {
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
