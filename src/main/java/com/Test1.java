package com;

import org.junit.Test;

/**
 * @ClassName Test1
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/10
 * @Version V1.0
 **/
public class Test1 {

    /**
     * @MethodName: show
     * @Description: TODO
     * @Param: [a, b]
     * @Return: void
     * @Author: lxc
     * @Date: 2020/3/10 10:58
     **/
    @Test
    public void show(){
        int a=3,b=4;
        System.out.printf("%S%d%n","The result is:",this.add(a,b));
    }

    /**
     * @MethodName: add
     * @Description: TODO
     * @Param: [a, b]
     * @Return: int
     * @Author: lxc
     * @Date: 2020/3/12 15:21
     **/
    public int add(int a,int b){
        int result =0;
        result = a+b;
        return result;
    }
}
