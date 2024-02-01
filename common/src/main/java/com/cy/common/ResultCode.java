package com.cy.common;

@lombok.Getter
public enum ResultCode {

    SUCCESS(200, "接口调用成功"),
    ERROR(500, "接口调用失败");

    ResultCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private final int code;
    private final String description;

}