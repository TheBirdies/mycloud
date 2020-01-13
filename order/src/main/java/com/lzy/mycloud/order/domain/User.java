package com.lzy.mycloud.order.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class User {
    private int id;
    private String username;
    private String password;
    private int age;
    private Date time;
}
