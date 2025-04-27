package com.example.demo.designPattern.prototype;

import lombok.Data;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:14
 */
@Data
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;


    abstract void draw();

    /**
     * 浅拷贝
     * @return
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
