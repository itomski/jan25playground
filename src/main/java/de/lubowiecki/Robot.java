package de.lubowiecki;

public class Robot {

    private String name;
    private int x;
    private int y;

    public Robot(String name) {
        this.name = name;
        // x und y starten bei 0
    }

    public Robot(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void goUp() {
        x++;
    }

    public void goDown() {
        x--;
    }

    public void goLeft() {
        y--;
    }

    public void goRight() {
        y++;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
