package homework_6;

public class Notebook {
    
    String brend;
    String color;
    double screen;
    String brendCpu;
    int numCores;
    int ram;
    int memory;
    String brendVideo;


    public Notebook(String brend, String color, double screen, String brendCpu, int numCores, int ram, int memory,
            String brendVideo) {
        this.brend = brend;
        this.color = color;
        this.screen = screen;
        this.brendCpu = brendCpu;
        this.numCores = numCores;
        this.ram = ram;
        this.memory = memory;
        this.brendVideo = brendVideo;
    }


    public String getBrend() {
        return brend;
    }


    public String getColor() {
        return color;
    }


    public double getScreen() {
        return screen;
    }


    public String getBrendCpu() {
        return brendCpu;
    }


    public int getNumCores() {
        return numCores;
    }


    public int getRam() {
        return ram;
    }


    public int getMemory() {
        return memory;
    }


    public String getBrendVideo() {
        return brendVideo;
    }

    @Override
    public String toString() {
        return String.format("Noutbook: %s, color: %s size: %.1f inch Processor: %s Количество ядер: %d Ram: %d Gb HDD: %d Gb videocard: %s\n", getBrend(), getColor(), getScreen(), getBrendCpu(), getNumCores(), getRam(), getMemory(), getBrendVideo());
    }
    
}
