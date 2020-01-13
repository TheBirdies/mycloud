package com.lzy.mycloud.order.service.impl;

import com.lzy.mycloud.order.service.ServiceA;
import com.lzy.mycloud.order.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements ServiceB {
    @Autowired
     ServiceA serviceA;
    @Override
    public void serviceB() {

    }

    public static void main(String[] args) {
            int[] ls={1,2,3,4,5,6,7,8,9};

            for (int i = 0; i <ls.length ; i++) {
                int idex=ls[i];
                boolean flag=false;
                if((i&1)==0){
//                if(i%2==0){
                    flag=true;
                }
                System.out.println(ls[i]+"是否是奇数:"+flag);
            }
    }
}
