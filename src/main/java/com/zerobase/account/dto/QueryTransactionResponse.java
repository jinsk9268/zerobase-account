package com.zerobase.account.dto;

import com.zerobase.account.type.TransactionResultType;
import com.zerobase.account.type.TransactionType;
import lombok.*;

import java.time.LocalDateTime;

/**
 * 응닶값
 * "accountNumber":"1000000000",
 * "transactionType":"USE",
 * "transactionResult":"S",
 * "transactionId":"5d011bb6d82cc50aecf8e27cdabb6772",
 * "amount":1000,
 * "transactedAt":"2022-06-01T23:26:14.671859"
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QueryTransactionResponse {
    private String accountNumber;
    private TransactionType transactionType;
    private TransactionResultType transactionResult;
    private String transactionId;
    private Long amount;
    private LocalDateTime transactedAt;

    public static QueryTransactionResponse from(TransactionDto transactionDto) {
        return QueryTransactionResponse.builder()
                .accountNumber(transactionDto.getAccountNumber())
                .transactionType(transactionDto.getTransactionType())
                .transactionResult(transactionDto.getTransactionResultType())
                .transactionId(transactionDto.getTransactionId())
                .amount(transactionDto.getAmount())
                .transactedAt(transactionDto.getTransactedAt())
                .build();
    }
}
