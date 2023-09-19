package com.xin.design.behaviorpattern.iteratorpattern;

/**
 * @description: 迭代器demo
 * @author: puxin
 * @version: 1.0
 * @ClassName: IteratorPatternDemo
 * @create: 2023-09-15 10:30
 **/
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterrator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
