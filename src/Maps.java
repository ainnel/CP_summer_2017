import javafx.scene.shape.Circle;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ania on 19.04.2017.
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, Shape> shapeMap = new HashMap<>();
        shapeMap.put("Circle 1", new Circle(parA:4));
        shapeMap.put("Rectangle", new Rectangle(parA:2));
        shapeMap.put("Square", new Square(parA:6));

        System.out.println("Circle: " + shapeMap.get("Circle 1"));

        System.out.println();

        for (String s : shapeMap.keySet()) {
            System.out.println(s + " = " shapeMap.get(s));
        }
    }
}
