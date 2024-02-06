package com.itheima.d1_iunit;

import org.junit.*;

/**
 * 测试类
 * */

public class StringUtilTest {
    @BeforeClass
    public static void test11(){
        System.out.println("--->test11 BeforeClass 执行了----");
    }

    @AfterClass
    public static void test22(){
        System.out.println("--->test22 AfterClass 执行了----");
    }

    @Before
    public void test1(){
        System.out.println("--->test1 Before 执行了---------");
    }

    @After
    public void test2(){
        System.out.println("--->test2 After 执行了---------");
    }




    @Test//测试方法
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);

    }

    @Test
    public void TestGetMaxIndex(){
        int index1=StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2=StringUtil.getMaxIndex("admin");
        System.out.println(index2);

        //断言机制：程序员可以通过预测业务方法的结果
        Assert.assertEquals("测试结果有bug！",4,index2);
    }
}
