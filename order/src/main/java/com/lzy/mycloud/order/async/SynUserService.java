package com.lzy.mycloud.order.async;

import com.lzy.mycloud.order.domain.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SynUserService {

//    @Async("asyncServiceExecutor")
    public String addOrder(){
        System.out.println(Thread.currentThread().getId()+"******第三次打印线程");
        String  st= UUID.randomUUID().toString();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return st;
    }
}
