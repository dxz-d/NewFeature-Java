package com.example.id;

/**
 * @Author: diaoxiuze
 * @Date: 2022/12/16 10:27
 */
public class Test {
    public static void main(String[] args) {
        var snowFlakeGenerateIdWorker = new SnowFlakeGenerateIdWorker(0L,0L);
        var id = snowFlakeGenerateIdWorker.generateNextId();
        System.out.println(id);
    }
}
