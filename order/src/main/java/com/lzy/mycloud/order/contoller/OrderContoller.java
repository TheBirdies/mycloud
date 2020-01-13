package com.lzy.mycloud.order.contoller;

import com.lzy.mycloud.order.domain.User;
import com.lzy.mycloud.order.service.OrderService;
import com.lzy.mycloud.order.service.ServiceA;
import com.lzy.mycloud.order.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderContoller {

    @Autowired
    private OrderService orderService;
    @Autowired
    private  ServiceB serviceB;
    @Autowired
    private ServiceA serviceA;

    @RequestMapping("/addOrder")
    public String addOrder(){
        try {
            System.out.println(Thread.currentThread().getId()+"******第一次打印线程");
            Long star=System.currentTimeMillis();
            User res= orderService.addOrder();
            System.out.println(System.currentTimeMillis()-star);
             return res.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
    @RequestMapping("/test")
    public String test(){
        try {
            serviceA.serviceA();
            serviceB.serviceB();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "null";
    }
}
