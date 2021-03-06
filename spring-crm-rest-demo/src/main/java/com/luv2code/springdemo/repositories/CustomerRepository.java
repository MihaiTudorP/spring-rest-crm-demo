/**
 * 
 */
package com.luv2code.springdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

/**
 * @author Mihai-Tudor Popescu
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
