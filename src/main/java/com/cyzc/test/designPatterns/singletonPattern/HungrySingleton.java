package com.cyzc.test.designPatterns.singletonPattern;

/**
 * 饿汉式单例：类加载的时候即创建：不支持延迟加载
 *
 * @author Cyzc
 * @since 2021-08-10
 */
public class HungrySingleton {
    //类加载的时候即创建实例，而不是new对象的时候创建实例
    private static final HungrySingleton instance=new HungrySingleton();
    //私有的构造器
    private HungrySingleton() {
    }

    private static HungrySingleton getInstance(){
        return instance;
    }
}