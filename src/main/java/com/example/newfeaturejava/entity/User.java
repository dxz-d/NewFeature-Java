package com.example.newfeaturejava.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author: diaoxiuze
 * @Date: 2022/12/15 18:49
 */
@Builder
@Data
public class User {

    private String id;

    private String userName;

    private Integer age;
}
