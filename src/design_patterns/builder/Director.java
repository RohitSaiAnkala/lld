package design_patterns.builder;

public class Director {
    DesktopBuilder desktopBuilder;

    Director(DesktopBuilder desktopBuilder) {
        this.desktopBuilder = desktopBuilder;
    }

    Desktop buildDesktop() {
        desktopBuilder
                .buildMonitor()
                .buildMouse()
                .buildRam()
                .buildSpeaker()
                .buildProcessor()
                .buildKeyBoard()
                .buildMotherBoard();
        return desktopBuilder.getDesktop();
    }
}
