package com.zerobase.account.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

public class UseBalance {
    /**
     * 요청 값
     * "userId":1,
     * "accountNumber":"1000000000",
     * "amount":1000
     */
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long userId;

        @NotBlank
        @Size(min = 10, max = 10)
        private String accountNumber;

        @NotNull
        @Min(10)
        @Max(1_000_000_000)
        private Long amount;
    }
}
