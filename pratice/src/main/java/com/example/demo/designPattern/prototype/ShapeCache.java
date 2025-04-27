package com.example.demo.designPattern.prototype;

import java.util.Hashtable;

/**
 * @author edz
 * @version V1.0
 * @Package com.example.demo.designPattern.prototype
 * @date 2022-09-29 20:24
 */
public class ShapeCache {

    private static Hashtable<String, Shape> cache = new Hashtable<>();

    public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
      cache.put(circle.getId(),circle);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("2");
      cache.put(rectangle.getId(),rectangle);

      Square square = new Square();
      square.setId("3");
      cache.put(square.getId(),square);
    }


    public static Shape getShape(String id) {
        Shape shape = cache.get(id);
        return (Shape) shape.clone();
    }
}
