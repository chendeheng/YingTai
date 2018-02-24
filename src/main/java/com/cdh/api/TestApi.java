package com.cdh.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @author chendeheng   上午11:29 2018/2/24
 */
@RestController
@RequestMapping("yingtai")
public class TestApi {


    @GetMapping("hello")
    public String getYingTaiString() {
        return "yingtai";
    }

}
