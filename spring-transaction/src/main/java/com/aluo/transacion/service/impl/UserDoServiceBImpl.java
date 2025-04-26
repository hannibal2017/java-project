package com.aluo.transacion.service.impl;

import com.aluo.transacion.mapper.UserDoMapper;
import com.aluo.transacion.model.domain.UserDo;
import com.aluo.transacion.service.UserDoServiceA;
import com.aluo.transacion.service.UserDoServiceB;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author edz
 * @version V1.0
 * @Package com.aluo.transacion.service.impl
 * @date 2025/4/26 16:45
 */
@Service
public class UserDoServiceBImpl extends ServiceImpl<UserDoMapper,UserDo> implements UserDoServiceB {
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public String insertB() {
        UserDo userDoB = new UserDo();
        userDoB.setName("B");
        userDoB.insert();
        int a = 2 / 0;
        return "yes";
    }
}
