package design_patterns.builder;

public class Desktop {
    String monitor;
    String keyBoard;
    String mouse;
    String ram;
    String speaker;
    String processor;
    String motherBoard;

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void showSpecs() {
        String desktop = "Desktop{" +
                "monitor='" + monitor + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", ram='" + ram + '\'' +
                ", speaker='" + speaker + '\'' +
                ", processor='" + processor + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                '}';
        System.out.println(desktop);
    }
}
