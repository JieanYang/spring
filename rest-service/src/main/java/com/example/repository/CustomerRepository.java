package com.example.repository;

import com.example.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  List<Customer> findByFirstName(String FirstName);
  List<Customer> findAll();
}



