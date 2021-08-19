package com.cyzc.test.designPatterns.singletonPattern;

/**
 * 懒汉式单例
 *
 * 优点： 支持延迟加载，只有在创建实例的时候才进行类加载
 * 缺点：并发度低，获取实例的方法加锁，当该对象创建频率很高的时候并发度低
 * @author Cyzc
 * @since 2021-08-10
 */
public class LazySingleton {

    private static LazySingleton instance;

    //私有的构造器，防止通过new创建实例
    private LazySingleton() {
    }
    /**
     * 当instance 为null 的时候创建新实例，否则返回存在的实例
     * @author cyzc
     * @return {@link LazySingleton}
     * @since 2021/8/10 23:18
     */
    private static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}