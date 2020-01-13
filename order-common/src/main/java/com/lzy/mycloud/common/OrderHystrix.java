package com.lzy.mycloud.common;

import org.springframework.stereotype.Component;

@Component
public class OrderHystrix implements OrderFeign {
    @Override
    public String addOrder() {
        return null;
    }
}
