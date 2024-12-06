package org.howard.edu.lsp.finalexam.question3;

//Shape Interface
interface Shape {
 void draw(); // Method to be implemented by all shapes
}

//Circle Class
class Circle implements Shape {
 public void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Rectangle Class
class Rectangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Triangle Class
class Triangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Triangle");
 }
}

//Singleton ShapeFactory to create Shape objects
class ShapeFactory {
 // Static instance for Singleton
 private static ShapeFactory instance;

 // Private constructor to prevent direct instantiation
 private ShapeFactory() {}

 // Provides a single instance of ShapeFactory
 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Returns a Shape object based on the shape type
 public Shape getShape(String shapeType) {
     if (shapeType == null) return null;
     switch (shapeType.toLowerCase()) {
         case "circle": return new Circle();
         case "rectangle": return new Rectangle();
         case "triangle": return new Triangle();
         default: return null; // For invalid shape types
     }
 }
}

//ShapeRenderer Class to use ShapeFactory
public class ShapeRenderer {
 private final ShapeFactory factory; // Singleton factory instance

 // Constructor initializes the ShapeFactory
 public ShapeRenderer() {
     this.factory = ShapeFactory.getInstance();
 }

 // Draws the specified shape
 public void renderShape(String shapeType) {
     Shape shape = factory.getShape(shapeType); // Fetch the Shape object
     if (shape != null) {
         shape.draw(); // Call the draw method
     } else {
         System.out.println("Invalid shape type: " + shapeType);
     }
 }

 // Main method for demonstration
 public static void main(String[] args) {
     ShapeRenderer renderer = new ShapeRenderer();
     renderer.renderShape("circle");    // Drawing a Circle
     renderer.renderShape("rectangle"); // Drawing a Rectangle
     renderer.renderShape("triangle");  // Drawing a Triangle
     renderer.renderShape("pentagon");  // Invalid shape type: pentagon
 }
}
