package com.zerobase.account.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND("사용자가 없습니다"),
    MAX_ACCOUNT_PER_USER_10("사용자별 최대 계좌 개수 한도는 10개입니다.");

    private final String description;
}
