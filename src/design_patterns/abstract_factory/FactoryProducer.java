package design_patterns.abstract_factory;

public class FactoryProducer {
    public static ShapeFactory getFactory(boolean isRounded){
        if(isRounded)
            return new RoundedShapeFactory();
        else
            return new NormalShapeFactory();

    }
}
