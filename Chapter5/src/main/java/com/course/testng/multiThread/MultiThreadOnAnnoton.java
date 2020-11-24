package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnoton {


    //注解实现多线程测试
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
