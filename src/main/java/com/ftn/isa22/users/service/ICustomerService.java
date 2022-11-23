package com.ftn.isa22.users.service;

import com.ftn.isa22.users.domain.Customer;
import com.ftn.isa22.users.dto.CustomerDTO;

public interface ICustomerService {
    Customer registerCustomer(CustomerDTO customerDTO) throws Exception;
}
