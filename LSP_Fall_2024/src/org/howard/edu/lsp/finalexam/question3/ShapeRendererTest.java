package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeRendererTest {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.getShape("circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.getShape("rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.getShape("triangle");
        assertNotNull(triangle);
        assertTrue(triangle instanceof Triangle);
    }

    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.getShape("hexagon");
        assertNull(unknown);
    }
}
