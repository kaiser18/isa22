package com.ftn.isa22.users.mapper;

import com.ftn.isa22.general.mapper.AddressMapper;
import com.ftn.isa22.users.domain.Customer;
import com.ftn.isa22.users.dto.CustomerDTO;

public class CustomerMapper {

    private CustomerMapper() {}

    public static CustomerDTO mapCustomerToDTO(Customer customer) {
        return new CustomerDTO(customer.getId(), customer.getName(), customer.getSurname(), customer.getJmbg(), customer.getDateOfBirth(), AddressMapper.mapAddressToDTO(customer.getAddress()), customer.getGender(), customer.getPhoneNumber(), customer.getEmail(), customer.getPassword(), customer.getProfession(), customer.getProfessionInfo(), customer.getRole(), AuthorityMapper.mapAuthoritiesToListDTOs(customer.getAuthorities()));
    }

    public static Customer mapDTOToCustomer(CustomerDTO dto) {
        Customer customer = new Customer();

        customer.setId(dto.getId());
        customer.setName(dto.getName());
        customer.setSurname(dto.getSurname());
        customer.setJmbg(dto.getJmbg());
        customer.setDateOfBirth(dto.getDateOfBirth());
        customer.setAddress(AddressMapper.mapDTOToAddress(dto.getAddress()));
        customer.setGender(dto.getGender());
        customer.setPhoneNumber(dto.getPhoneNumber());
        customer.setEmail(dto.getEmail());
        customer.setPassword(dto.getPassword());
        customer.setProfession(dto.getProfession());
        customer.setProfessionInfo(dto.getProffesionInfo());
        customer.setAuthorities(AuthorityMapper.mapDTOsToListAuthorities(dto.getAuthorities()));

        return customer;
    }
}
