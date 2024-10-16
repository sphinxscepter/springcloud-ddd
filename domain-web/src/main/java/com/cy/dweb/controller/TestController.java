package com.cy.dweb.controller;

import com.cy.common.VO.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;

@RestController("/")
@CrossOrigin("*")
@Slf4j
public class TestController {

    @GetMapping("/test1")
    @ResponseBody
    public Result test1(HttpServletRequest request) {
        log.info("-->test1 请求地址：" + request.getRequestURI());
        log.info("-->test1 远程地址：" + request.getRemoteAddr());
        log.info("-->test1 远程地址：" + request.getRemoteHost());
        log.info("-->test1 远程地址：" + request.getRemoteUser());
        log.info("-->test1 service test1 invoked!!!");
        log.info(request.getRequestURI());
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            log.info("{} : {}", headerName, request.getHeader(headerName));
        }
        request.getHeaderNames().asIterator().forEachRemaining(headerName -> {
            log.info(request.getHeader(headerName));
        });
        HashMap<String, String> data = new HashMap<>(1);
        data.put("info", "test1 service test1 invoked!!!");
        return Result.success(data);
    }

    @GetMapping("/test2")
    @ResponseBody
    public Result test2(HttpServletRequest request) {
        log.info("-->test2 请求地址：" + request.getRequestURI());
        log.info("-->test1 service test2 invoked!!!");
        HashMap<String, String> data = new HashMap<>(1);
        data.put("info", "test1 service test2 invoked!!!");
        return Result.success(data);
    }
}
