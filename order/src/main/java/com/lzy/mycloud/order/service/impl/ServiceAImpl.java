package com.lzy.mycloud.order.service.impl;

import com.lzy.mycloud.order.service.ServiceA;
import com.lzy.mycloud.order.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceAImpl implements ServiceA {
    @Autowired
     ServiceB serviceB;
    @Override
    public void serviceA() {
        serviceB.serviceB();
    }
}
