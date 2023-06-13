package design_patterns.builder;

public abstract class DesktopBuilder {
    Desktop desktop;

    DesktopBuilder(Desktop desktop) {
        this.desktop = desktop;
    }

    public abstract DesktopBuilder buildMonitor();

    public abstract DesktopBuilder buildKeyBoard();

    public abstract DesktopBuilder buildMouse();

    public abstract DesktopBuilder buildSpeaker();

    public abstract DesktopBuilder buildRam();

    public abstract DesktopBuilder buildProcessor();

    public abstract DesktopBuilder buildMotherBoard();

    public Desktop getDesktop() {
        return desktop;
    }
}
