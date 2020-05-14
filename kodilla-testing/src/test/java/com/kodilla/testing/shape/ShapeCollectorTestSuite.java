package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new Triangle(23);

        collector.addFigure(shape1);

        Assert.assertEquals(shape1, collector.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new Triangle(23);
        Shape shape2 = new Square(33);

        collector.addFigure(shape1);
        collector.addFigure(shape2);

        collector.removeFigure(shape1);

        Assert.assertEquals(shape2, collector.getFigure(0));
    }

    @Test
    public void testGetFigure() {
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new Triangle(23);
        Shape shape2 = new Square(33);

        collector.addFigure(shape1);
        collector.addFigure(shape2);

        Assert.assertEquals(shape2, collector.getFigure(1));
    }

    @Test
    public void testShowFigures() {
        ShapeCollector collector = new ShapeCollector();
        Shape shape1 = new Triangle(23);

        collector.addFigure(shape1);

        Assert.assertTrue(collector.showFigures());
    }
}
