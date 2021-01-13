package com.tledu.cn.proxy.static_proxy;
//代理类  增强 主营业务类的功能
public class Cinema implements Movie {

    RealMovie movie;


    public Cinema(RealMovie movie) {
        this.movie = movie;
    }


    @Override
    public void play() {
/*
 2.连接点（JoinPoint）
　　这个更好解释了，就是spring允许你使用通知的地方，那可真就多了，
   基本每个方法的前，后（两者都有也行）
  3.切入点（Pointcut）：真正被切入的连接点称之为 切入点
　　上面说的连接点的基础上，来定义切入点，你的一个类里，有15个方法，
    那就有几十个连接点了对把，
    但是你并不想在所有方法附近都使用通知（使用叫织入，以后再说），
    你只想让其中的几个，在调用这几个方法之前，
    之后或者抛出异常时干点什么，那么就用切点来定义这几个方法，
    让切点来筛选连接点，选中那几个你想要的方法。
  4.切面（Aspect）
　　切面是通知和切入点的结合。现在发现了吧，
    没连接点什么事情，连接点就是为了让你好理解切点，
    搞出来的，明白这个概念就行了。
    通知说明了干什么和什么时候干
    （什么时候通过方法名中的before,after，around等就能知道），
    而切入点说明了在哪干（指定到底是哪个方法），
    这就是一个完整的切面定义。
   5.织入（weaving）：前面切入的动作过程，称之为引入 或者 切入
   6.目标（target）：被引入切面的类称之为目标
　　引入中所提到的目标类，也就是要被通知的对象，
    也就是真正的业务逻辑，他可以在毫不知情的情况下，
    被咱们织入切面。而自己专注于业务本身的逻辑。
*/

        guanggao(true);

//        核心内容  就是realmovei执行自己的play
        movie.play();

        guanggao(false);


    }


//    1.通知（Advice）
    public void guanggao(boolean isStart){
        if ( isStart ) {
            System.out.println("电影马上开始了，爆米花、可乐、口香糖9.8折，快来买啊！");
        } else {
            System.out.println("电影马上结束了，爆米花、可乐、口香糖9.8折，买回家吃吧！");
        }
    }

}