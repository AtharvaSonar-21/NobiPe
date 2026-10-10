package com.nobipe_backend.accountservice.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table (name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private String id;

    @Column (nullable = false, unique = true)
    private String accountNumber;

    @Column (nullable = false)    
    private String email;

    @Column (nullable = false)
    private String phone;
    
    @Column (nullable = false)
    private String accountHolderName;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private AccountType accounttype;

    @Enumerated (EnumType.STRING)
    @Column (nullable = false)
    private AccountStatus status;

    @Column (nullable = false, precision = 15, scale = 2)
    private BigDecimal balance;

    @Column (nullable = false, precision = 15, scale = 2)
    private BigDecimal dailyTransactionLimit;

    @CreationTimestamp 
    private LocalDateTime createdAt;

    @UpdateTimestamp 
    private LocalDateTime updatedAt;



}