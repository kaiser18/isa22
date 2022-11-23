package com.ftn.isa22.users.dto;

import com.ftn.isa22.general.dto.AddressDTO;
import com.ftn.isa22.users.domain.Authority;
import com.ftn.isa22.users.domain.enums.Gender;

import java.time.LocalDate;
import java.util.List;

public class CustomerDTO {
    private Long id;
    private String name;
    private String surname;
    private String jmbg;
    private LocalDate dateOfBirth;
    private AddressDTO address;
    private Gender gender;
    private String phoneNumber;
    private String email;
    private String password;
    private String profession;
    private String proffesionInfo;
    private String role;
    private List<AuthorityDTO> authorities;


    public CustomerDTO(Long id, String name, String surname, String jmbg, LocalDate dateOfBirth, AddressDTO address, Gender gender, String phoneNumber, String email, String password, String profession, String proffesionInfo, String role, List<AuthorityDTO> authorities) {
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
        this.profession = profession;
        this.proffesionInfo = proffesionInfo;
        this.role = role;
        this.authorities = authorities;
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProffesionInfo() {
        return proffesionInfo;
    }

    public void setProffesionInfo(String proffesionInfo) {
        this.proffesionInfo = proffesionInfo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<AuthorityDTO> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<AuthorityDTO> authorities) {
        this.authorities = authorities;
    }
}
