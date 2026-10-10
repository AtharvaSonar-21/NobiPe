package com.nobipe_backend.accountservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.nobipe_backend.accountservice.entity.AccountStatus;
import com.nobipe_backend.accountservice.entity.AccountType;


public class AccountResponse {
    private String id;
    private String accountNumber;
    private String email;
    private String phone;
    private String accountHolderName;
    private AccountType accounttype;
    private AccountStatus status;
    private BigDecimal balance;
    private BigDecimal dailyTransactionLimit;
    private LocalDateTime createdAt;

}
