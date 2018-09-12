package com.zjcy;

import com.zjcy.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by flyap on 2018/3/27.
 */
public class Test {
    public  static  void  main(String [] args){
    ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
    People p = (People)ctx.getBean("cutesource");
    System.out.println(p.getId());
    System.out.println(p.getName());
    System.out.println(p.getAge());
}
}
