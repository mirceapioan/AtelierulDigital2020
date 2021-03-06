package lab5.ch2;

public class Running implements Shoe {
    private String color;
    private int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }


}
