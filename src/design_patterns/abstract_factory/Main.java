package design_patterns.abstract_factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape roundedCircle = shapeFactory.getShape(ShapeType.CIRCLE);
        roundedCircle.draw();


        Shape roundedRectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        roundedRectangle.draw();

        shapeFactory = FactoryProducer.getFactory(false);
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

    }
}
