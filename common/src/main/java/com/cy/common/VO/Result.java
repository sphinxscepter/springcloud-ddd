package com.cy.common.VO;

import com.cy.common.domain.ResultCode;

public class Result {

    public Result(int status, String msg, Object data) {
    }

    public static Result success(Object data) {
        return new Result(
                ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getDescription(),
                data
        );
    }

    public static Result error() {
        return new Result(
                ResultCode.ERROR.getCode(),
                ResultCode.ERROR.getDescription(),
                null
        );
    }

}
