package com.RK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RK.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
