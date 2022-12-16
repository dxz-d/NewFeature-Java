package com.example.newfeaturejava.ten;

import com.example.newfeaturejava.entity.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: diaoxiuze
 * @Date: 2022/12/15 18:33
 */
public class Var01 {
    public static void main(String[] args) throws IOException {
        var codefx = new URL("http://codefx.org");
        var connection = codefx.openConnection();
        var reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));


        var numbers = List.of("a", 1, false);
        for (var nr : numbers) {
            System.out.println(nr + " ");
        }
        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " ");
        }

        // 编译器推断出类型 List<User>
        var users = new ArrayList<User>();
        User userDxz = User.builder().userName("dxz").age(11).build();
        System.out.println(userDxz);
        // 这样就不行了，会出现编译错误
//        users = new LinkedList<>();

    }
}
