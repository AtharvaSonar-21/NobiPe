package com.nobipe_backend.accountservice.dto;

import java.math.BigDecimal;

import com.nobipe_backend.accountservice.entity.AccountType;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class CreateAccountRequest {

    @NotBlank (message = "Account Holder Name is Required ")
    private String accountHolderName;

    @NotBlank (message = "Email is Required ")
    @Email (message = "Invalid email format ")
    private String email;

    
    @NotBlank (message = "Phone is Required ")
    private String phone;

    @NotBlank (message = "Account Type is Required ")
    private AccountType accounttype;

    @NotNull (message = "Intial Deposit is required ")
    @Positive (message = "Intial Deposit must be Positive")
    private BigDecimal InitailBalance;

    
}
