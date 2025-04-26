package com.aluo.transacion.service.impl;

import com.aluo.transacion.mapper.UserDoMapper;
import com.aluo.transacion.model.domain.UserDo;
import com.aluo.transacion.service.UserDoServiceA;
import com.aluo.transacion.service.UserDoServiceB;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.transacion.service.impl
 * @date 2025/4/26 16:45
 */
@Service
@Slf4j
public class UserDoServiceAImpl extends ServiceImpl<UserDoMapper, UserDo> implements UserDoServiceA {

    @Autowired
    private UserDoServiceB userDoServiceB;

    @Override
    @Transactional
    public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");

        try {
            userDoServiceB.insertB();
        } catch (Exception e) {
            log.error("error:{}", e.getMessage());
        }
        return "yes";
    }
}
