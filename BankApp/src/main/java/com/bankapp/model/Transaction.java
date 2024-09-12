package com.bankapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class Transaction
{
    private Long id;
    private BigDecimal amount;
    private String type;
    private LocalDateTime timestamp;

    @OneToMany
    @JoinColumn(name = "account_id")
    private Account account;

    public Transaction(BigDecimal amount, String type, LocalDateTime timestamp, Account account)
    {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
        this.account = account;
    }
}
