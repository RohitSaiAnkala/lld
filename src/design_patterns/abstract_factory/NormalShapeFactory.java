package design_patterns.abstract_factory;

public class NormalShapeFactory implements ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
