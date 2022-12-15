package com.example.newfeaturejava.ten;

import javax.swing.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: diaoxiuze
 * @Date: 2022/12/15 16:55
 * https://www.infoq.cn/article/java-10-var-type
 */
public class Var {
    public static void main(String[] args) {
        var name = "Mohamed Taman";
        var lastName = name.substring(8);
        System.out.println("Value: " + lastName + " ,and type is: " + lastName);

        var password = new JPasswordField("Password text");
        // 将密码的字符数组转换成字符串
        String.valueOf(password.getPassword());
        var textField = new JTextField("Hello text");
        textField = password;
        textField.getText();

        // 但不能将超类型 var 赋值给子类型 var，因为 JPasswordField 是 JTextField 的子类。
        // password = textField;

        var number = 10;
        number = 15;
        System.out.println(number);

        var list = List.of(10);
        System.out.println(list);

        // 等效于：var i = list.get(0);
        int i = list.get(0);
        System.out.println(i);

        var list2 = new ArrayList<>();
        list2.add(10);
//        int j = list2.get(0); // 编译错误
        // 需要进行转换，获得 int
        int k = (int) list2.get(0);

        System.out.println("k:" + k);

        var list3 = new ArrayList<Integer>();
        list3.add(10);
        System.out.println(list3);
        int a = list3.get(0);
        System.out.println(a);

        for (var x = 1; x <= 5; x++) {
            // 等效于: int m = x * 2;
            var m = x * 2;
            System.out.println("m:" + m);
        }

        var list4 = List.of(1, 2, 3, 4, 5, 6, 7);
        var stream = list4.stream();
        stream.filter(x ->  x % 2 == 0).forEach(System.out::println);


        var x = 1 > 0 ? 10 : -10;
        int xi = x;
        System.out.println("xi:" + x);

        var x1 = 1 > 0 ? 10 : "Less than zero";
        System.out.println("x1:" + x1 + x1.getClass());
        var x2 = 1 < 0 ? 10 : "Less than zero";
        System.out.println("x2:"+x2 + x2.getClass());

        Serializable x3 = 1 < 0 ? 10 : "Less than zero";
        System.out.println(x3.getClass());

        fl();

        var numbers = List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6);
        var integers = toIntgerList(numbers);
        System.out.println("integers:" + integers);


        var message = "running..."; //effectively final
        var runner = new Runnable(){
            @Override
            public void run() {
                System.out.println(message);
            }};

        runner.run();



//        var numbers22 = {2, 4, 6};

        var numbers22 = new int[]{2, 4, 6};
        var number22 = numbers22[1];
        number22 = number22 + 3;
        System.out.println(number22);

    }



    static <T extends Number> List<Integer> toIntgerList(List<T> numbers) {
        var integers = numbers.stream().map(Number::intValue).collect(Collectors.toList());
        return integers;
    }

    public static void fl(){
        var number1 = new BigDecimal("2.5");
//        squareOf(number1);
        number1 = squareOf(number1);
        System.out.println("squareOf:" + squareOf(number1));
    }

    static BigDecimal squareOf(BigDecimal number) {
        var result= number.multiply(number);
        return result;
    }
}
