package com.tledu.cn.aop.base_aop_xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;

//自定义类==>切面类
@Component
//添加@Aspect 即可将当前类作为切面类使用
//当前类会将方法内容切入到合适的连接点中
@Aspect
public class OperatorLog {
    
    @Pointcut("execution(* com.tledu.cn.aop.aop_anno.impl.*.*(..))")
//    @Pointcut("@annotation(com.tledu.cn.aop.aop_anno.self_anno.LogAnno)")
//    自定义
    public void pointCut(){}

    @After("pointCut()")
    public void adoAfter(JoinPoint joinPoint){

        System.out.println(" AnnoLog AOP After Advice...");
    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){

        System.out.println("LogAnno AOP Before Advice...");
    }
    

    
    @AfterReturning(pointcut="pointCut()",returning="result")
    public void afterReturn(JoinPoint pjp,Object result){
        System.out.println("LogAnno AOP AfterReturning Advice:" + result);
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
    }

//    @AfterThrowing(pointcut="pointCut()",throwing="ex")
//    public void afterThrowing(JoinPoint pjp,Exception ex){
//        System.out.println("AOP AfterThrowing Advice..." + ex);
//        System.out.println("AfterThrowing...");
//
//        MethodSignature ms= (MethodSignature) pjp.getSignature();
//        System.out.println("方法名");
//        System.out.println(ms.getMethod().getName());
//        System.out.println("包路径");
//        System.out.println(pjp.getTarget().getClass().getName());
//
//        System.out.println(ex.getMessage());
//    }
    
    @Around("pointCut()")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("AOP Aronud before...");
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("AOP Aronud after...");
    }
    
}