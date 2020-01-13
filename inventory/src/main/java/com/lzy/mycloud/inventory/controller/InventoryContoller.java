package com.lzy.mycloud.inventory.controller;

import com.lzy.mycloud.common.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inventory")
public class InventoryContoller {

    @Autowired
    private OrderFeign ff;
    @RequestMapping("/test")
    public  String  test(){
        System.out.println(111);
         return   ff.addOrder();
    }

}
