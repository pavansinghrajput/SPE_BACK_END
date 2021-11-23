package com.fooddel.Services;

import com.fooddel.beans.Customer;
import com.fooddel.repository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Mock
    CustomerRepository customerRepository;

    @InjectMocks
    CustomerService customerService = new CustomerService();

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetCustomer() {
        when(customerRepository.findAll()).thenReturn(Stream.of(new Customer("pavan", "singh", "8686886135", "hyderabad", "pavansingh9900@gmail.com", "pavan", false), new Customer("ayushman", "khurana", "8869054251", "narsinghpur", "ayushman9ym.19@gmail.com", "ayush", false)).collect(Collectors.toList()));

        System.out.println("testcase 1 hit");
        assertEquals(2, customerService.getCustomers().size());

    }
    @Test
    public void abc()
    {
        fail("Incomplete");
    }

}
