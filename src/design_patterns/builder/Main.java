package design_patterns.builder;

public class Main {
    public static void main(String[] args) {
        HpDesktopBuilder hpDesktopBuilder = new HpDesktopBuilder(new Desktop());
        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder(new Desktop());

        Director director1 = new Director(hpDesktopBuilder);
        Director director2 = new Director(dellDesktopBuilder);

        Desktop desktop1 = director1.buildDesktop();
        Desktop desktop2 = director2.buildDesktop();
        desktop1.showSpecs();
        desktop2.showSpecs();
    }
}
