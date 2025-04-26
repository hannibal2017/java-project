package com.aluo.transacion.controller;

import com.aluo.transacion.service.UserDoServiceA;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.transacion.controller
 * @date 2025/4/26 16:50
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDoServiceA userDoServiceA;

    @GetMapping (name = "新增", path = "/insert")
    public String insert() {
        return userDoServiceA.insertA();
    }
}
