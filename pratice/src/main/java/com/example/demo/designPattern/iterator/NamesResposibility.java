package com.example.demo.designPattern.iterator;

/**
 * @Author luozhenwu
 * @Date 2022/10/13 11:38
 * @Version 1.0
 **/
public class NamesResposibility implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hashNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return names[index++];
        }
    }
}
