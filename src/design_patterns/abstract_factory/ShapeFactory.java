package design_patterns.abstract_factory;

public interface ShapeFactory {
    Shape getShape(ShapeType shapeType);
}
