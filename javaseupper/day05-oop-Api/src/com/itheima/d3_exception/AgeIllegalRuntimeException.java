package com.itheima.d3_exception;
//必须让这个类继承自RuntimeException ，才能成为一个运行时异常类
public class AgeIllegalRuntimeException extends RuntimeException{
    //重写构造器

    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
