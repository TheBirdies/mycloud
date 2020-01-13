package com.lzy.mycloud.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "ORDER", fallback = OrderHystrix.class)
public interface OrderFeign {
    @PostMapping("/order/addOrder")
    String addOrder();

}
