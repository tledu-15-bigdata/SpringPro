package com.tledu.cn.aop.aop_anno.pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;

@Aspect//此类作为切面类
@Component//交由Spring接管
public class OperatorLog {
    //pointCut配置方式一：配置的路径下的所有类的所有方法作为切点
    //@Pointcut("execution(* cn.AOP.Annotation.Impl.*.*(..))")
    //pointCut配置方式二：把带有LogAnno（此包路径下的类）注解的类作为切点
    @Pointcut("@annotation(com.tledu.cn.aop.aop_anno.self_anno.LogAnno)")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(JoinPoint jp){
        System.out.println("***************************before***************************");
        System.out.println(jp.getSignature().getName());
        System.out.println(jp.getSignature().getDeclaringType());
        System.out.println(jp.getSignature().getDeclaringTypeName());
        Object[] args = jp.getArgs();
        for (Object arg : args) {
            System.out.println(arg.toString());
        }
    }

    @AfterReturning(value = "pointCut()",returning = "res")
    public void after1(JoinPoint jp,Object res){
        System.out.println("***************************afterReturn***************************");
//        System.out.println(jp.getSignature().getName());
//        MethodSignature signature = (MethodSignature) jp.getSignature();
//        Parameter[] parameters = signature.getMethod().getParameters();
//        Object[] args = jp.getArgs();
//        for(int i=0;i<parameters.length;i++){
//            System.out.println(parameters[i]+": "+args[i]);
//        }
//        System.out.println(jp.getSignature().getDeclaringType());
//        System.out.println(jp.getSignature().getDeclaringTypeName());
//        System.out.println("返回值"+res);
    }


//    @AfterThrowing(value = "pointCut()",throwing = "ex")
//    public void afterThrowing(JoinPoint jp,Exception ex){
//        System.out.println("***************************afterThrowing***************************");
//        System.out.println(jp.getSignature().getName());
//        MethodSignature signature = (MethodSignature) jp.getSignature();
//        Parameter[] parameters = signature.getMethod().getParameters();
//        Object[] args = jp.getArgs();
//        for(int i=0;i<parameters.length;i++){
//            System.out.println(parameters[i]+": "+args[i]);
//        }
//        System.out.println(jp.getSignature().getDeclaringType());
//        System.out.println(jp.getSignature().getDeclaringTypeName());
//        System.out.println(ex.getMessage());
//    }

    @After("pointCut()")
    public void after0(JoinPoint jp) {
        System.out.println("***************************after***************************");
//        System.out.println(jp.getSignature().getName());
//        System.out.println(jp.getSignature().getDeclaringType());
//        System.out.println(jp.getSignature().getDeclaringTypeName());
//        Object[] args = jp.getArgs();
//        for (Object arg : args) {
//            System.out.println(arg.toString());
//        }
    }
}
