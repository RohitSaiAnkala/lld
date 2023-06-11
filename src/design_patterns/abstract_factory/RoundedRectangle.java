package design_patterns.abstract_factory;

public class RoundedRectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rounded Rectangle is drawn");
    }
}
