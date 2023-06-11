package design_patterns.abstract_factory;

import design_patterns.factory.Circle;
import design_patterns.factory.Rectangle;

public class RoundedShapeFactory implements ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new RoundedCircle();
            case RECTANGLE:
                return new RoundedRectangle();
            default:
                return null;
        }
    }

}
