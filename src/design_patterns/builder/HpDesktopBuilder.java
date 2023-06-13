package design_patterns.builder;

public class HpDesktopBuilder extends DesktopBuilder {
    HpDesktopBuilder(Desktop desktop) {
        super(desktop);
    }

    @Override
    public DesktopBuilder buildMonitor() {
        desktop.setMonitor("Hp Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildKeyBoard() {
        desktop.setKeyBoard("Hp Monitor");
        return this;
    }

    @Override
    public DesktopBuilder buildMouse() {
        desktop.setMouse("Hp Mouse");
        return this;
    }

    @Override
    public DesktopBuilder buildSpeaker() {
        desktop.setSpeaker("Hp Speaker");
        return this;
    }

    @Override
    public DesktopBuilder buildRam() {
        desktop.setRam("Hp Ram");
        return this;
    }

    @Override
    public DesktopBuilder buildProcessor() {
        desktop.setProcessor("Hp Processor");
        return this;
    }

    @Override
    public DesktopBuilder buildMotherBoard() {
        desktop.setMotherBoard("Hp MotherBoard");
        return this;
    }
}
