/*  
 * Ibrahim Ali
 * 301022172
 * 13-04-2021
 * */

package com.assignment.web;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}