/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_pattern;

/**
 *
 * @author Firew Abebe
 */
public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape sh1 = shapeFactory.getShape("Circle");
        
        sh1.draw();
        
        Shape sh2 = shapeFactory.getShape("Rectangle");
        
        sh2.draw();
    }
}
