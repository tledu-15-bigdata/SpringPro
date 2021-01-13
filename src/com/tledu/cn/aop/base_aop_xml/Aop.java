package com.tledu.cn.aop.base_aop_xml;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Parameter;

/**
 * @ClassName Aop
 * @Description TODO
 * 被切入的方法来源
 * @Author YouLi
 * @Date 2018/4/17 21:35
 **/
//切面  Aspect
public class Aop {

    private Parameter[] param;
    private Parameter[] param1;

    int paramNum=0;

//    开始
    public void begin(JoinPoint joinPoint){
        System.out.println("=--==---==--1111");
        System.out.println("新添功能代码AOP1");

        int a=1;
        paramNum=1;
        System.out.println(joinPoint.getSignature().getName());
        if(joinPoint.getArgs().length>0){
            System.out.println(joinPoint.getArgs()[0]);
        }
//        joinPoint.getS
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(joinPoint.getSignature().getDeclaringType());


    }
//    结束
    public void after(JoinPoint joinPoint){
        System.out.println("=--==---==--222");

        System.out.println("新添功能代码AOP2");
        System.out.println(joinPoint.getSignature().getName());
        if(joinPoint.getArgs().length>0){
            System.out.println(joinPoint.getArgs()[0]);
        }
        int b=100;
        int c=b-paramNum;
        System.out.println(c);
//        joinPoint.getS
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println(joinPoint.getSignature().getDeclaringType());
    }





//返回值
//    public void afterThrowing(JoinPoint pjp,Exception ex){
//
//        System.out.println("=--==---==--333");
//
//        MethodSignature ms= (MethodSignature) pjp.getSignature();
//        System.out.println("方法名");
//        System.out.println(ms.getMethod().getName());
//        System.out.println("包路径");
//        System.out.println(pjp.getTarget().getClass().getName());
//
//        System.out.println(ex.getMessage());
//
//
//    }

//    public void afterReturning(JoinPoint pjp,Object result){
////        Object[] objArray=pjp.getArgs();
////        if(objArray.length>0){
////            System.out.println(objArray[0]);
////            System.out.println(objArray[1]);
////        }
//        System.out.println("=-=-=-=-=-=-=");
//        MethodSignature ms= (MethodSignature) pjp.getSignature();
//        System.out.println("方法名");
//        System.out.println(ms.getMethod().getName());
//        System.out.println("参数：");
//        Parameter[] param=ms.getMethod().getParameters();
//
//        if(param.length>0){
//            System.out.println(param[0]);
//            System.out.println(pjp.getArgs()[0]);
//            System.out.println(param[1]);
//            System.out.println(pjp.getArgs()[1]);
//        }
//
//        System.out.println("返回值类型");
//        System.out.println(ms.getReturnType());
//        System.out.println(result);
//    }

//    public void around(ProceedingJoinPoint pjp){
//
//    }
}
