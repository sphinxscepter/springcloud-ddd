package com.cy.dweb.controller;

import com.cy.common.ResultCode;
import common.domain.VO.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController("/")
@CrossOrigin("*")
@Slf4j
public class TestController {

    @GetMapping("/test1")
    @ResponseBody
    public Result<String> test1(HttpServletRequest request) {
        log.info("-->test1 请求地址：" + request.getRequestURI());
        log.info("-->test1 service test1 invoked!!!");
        return new Result<>(ResultCode.SUCCESS.getCode(), "service test1 invoked!!!", null);
    }

    @GetMapping("/test2")
    @ResponseBody
    public Result<String> test2(HttpServletRequest request) {
        log.info("-->test2 请求地址：" + request.getRequestURI());
        log.info("-->test2 service test1 invoked!!!");
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getDescription(), null);
    }
}
