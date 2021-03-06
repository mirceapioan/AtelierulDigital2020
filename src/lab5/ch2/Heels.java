package lab5.ch2;

public class Heels implements Shoe {
    private String color;
    private int size;

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }
}
