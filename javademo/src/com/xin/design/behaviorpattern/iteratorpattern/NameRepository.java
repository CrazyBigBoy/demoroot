package com.xin.design.behaviorpattern.iteratorpattern;

/**
 * @description:
 * @author: puxin
 * @version: 1.0
 * @ClassName: NameRepository
 * @create: 2023-09-15 10:33
 **/
public class NameRepository implements Container {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterrator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length ? true : false;
        }

        @Override
        public Object next() {
            return hasNext() ? names[index++] : null;
        }
    }
}
