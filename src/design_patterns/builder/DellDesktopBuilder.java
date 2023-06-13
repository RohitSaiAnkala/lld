package design_patterns.builder;

public class DellDesktopBuilder extends DesktopBuilder {
    DellDesktopBuilder(Desktop desktop) {
        super(desktop);
    }

    @Override
    public DesktopBuilder buildMonitor() {
        desktop.setMonitor("Dell Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildKeyBoard() {
        desktop.setKeyBoard("Dell Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildMouse() {
        desktop.setMouse("Dell Mouse");
        return this;
    }

    @Override
    public DesktopBuilder buildSpeaker() {
        desktop.setSpeaker("Dell Speaker");
        return this;
    }

    @Override
    public DesktopBuilder buildRam() {
        desktop.setRam("Dell Ram");
        return this;
    }

    @Override
    public DesktopBuilder buildProcessor() {
        desktop.setProcessor("Dell Processor");
        return this;
    }

    @Override
    public DesktopBuilder buildMotherBoard() {
        desktop.setMotherBoard("Dell MotherBoard");
        return this;
    }
}
