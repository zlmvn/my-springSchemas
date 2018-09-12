package com.zjcy.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
//基于 Spring 可扩展 Schema 提供自定义配置支持
public class MyNamespaceHandler extends NamespaceHandlerSupport {  
    public void init() {  
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());  
    }  
}  