package com.burakguclu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.burakguclu.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

}
