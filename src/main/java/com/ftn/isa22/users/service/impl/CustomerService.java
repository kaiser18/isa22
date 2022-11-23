package com.ftn.isa22.users.service.impl;

import com.ftn.isa22.general.domain.Address;
import com.ftn.isa22.general.mapper.AddressMapper;
import com.ftn.isa22.general.repository.AddressRepository;
import com.ftn.isa22.users.domain.Customer;
import com.ftn.isa22.users.dto.CustomerDTO;
import com.ftn.isa22.users.mapper.CustomerMapper;
import com.ftn.isa22.users.repository.CustomerRepository;
import com.ftn.isa22.users.repository.UserRepository;
import com.ftn.isa22.users.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {

    private final AuthorityService authorityService;
    private final AddressRepository addressRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(AuthorityService authorityService, AddressRepository addressRepository, BCryptPasswordEncoder passwordEncoder, UserRepository userRepository, CustomerRepository customerRepository) {
        this.authorityService = authorityService;
        this.addressRepository = addressRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer save(Customer c) {
        return userRepository.save(c);
    }

    @Override
    public Customer registerCustomer(CustomerDTO customerDTO) throws Exception {
        //TODO add email verification
        if(userRepository.findByEmail(customerDTO.getEmail()) == null) {
            String role = "ROLE_CUSTOMER";

            String password = passwordEncoder.encode(customerDTO.getPassword());
            customerDTO.setPassword(password);

            Address a = AddressMapper.mapDTOToAddress(customerDTO.getAddress());
            addressRepository.save(a);

            Customer customer = CustomerMapper.mapDTOToCustomer(customerDTO);
            customer.setAuthorities(authorityService.getAllRoleAuthorities(role));
            customer.setAddress(a);

            Optional<Customer> saved = Optional.of(save(customer));

            return saved.get();
        }

        throw new Exception();
    }
}
