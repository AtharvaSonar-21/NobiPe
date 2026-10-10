package com.nobipe_backend.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nobipe_backend.accountservice.entity.Account;

/**
 * AccountRepository
 */

public interface AccountRepository extends JpaRepository<Account, String>{

    
}