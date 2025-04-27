package com.example.demo.designPattern.factory.abstractFactory;

import org.springframework.util.StringUtils;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.factory.abstractFactory
 * @date 2022-09-29 22:03
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(StringUtils.isEmpty(color)){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }else if(color.equalsIgnoreCase("white")){
            return new White();
        }
        return null;
    }
}
