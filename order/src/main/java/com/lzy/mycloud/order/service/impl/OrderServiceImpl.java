package com.lzy.mycloud.order.service.impl;

import com.lzy.mycloud.order.async.SynUserService;
import com.lzy.mycloud.order.dao.UserDao;
import com.lzy.mycloud.order.domain.User;
import com.lzy.mycloud.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private SynUserService synUserService;
    @Override
    public User addOrder() {
            System.out.println(1111);
//            try {
                User user=new User();
                user.setAge(11);
                user.setUsername("uname"+11);
                user.setPassword("pwd"+11);
                user.setTime(new Date());
                userDao.addUser(user);
      /*      }catch (Exception e){
                e.printStackTrace();
                System.out.println("异常日志");
                return "";
            }*/
        System.out.println(Thread.currentThread().getId()+"******第二次打印线程");
            String rs =synUserService.addOrder();

            return user;
    }

    @Async("asyncServiceExecutor")
    public  String bb()  {
        System.out.println(Thread.currentThread().getId()+"******第三次打印线程");
        String  st= UUID.randomUUID().toString();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return st;
    }
    @Override
    @Transactional(rollbackFor ={RuntimeException.class,Error.class})
    public void add() {
        User user=new User();
        user.setAge(0);
        user.setUsername("222");
        user.setPassword("222");
        userDao.addUser(user);
        throw  new RuntimeException();
    }
}
