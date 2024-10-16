package com.cy.common.domain;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(200, "接口调用成功"),
    ERROR(500, "接口调用失败");

    ResultCode(int code1, String description1) {
        this.code = code1;
        this.description = description1;
    }

    private final int code;
    private final String description;

}