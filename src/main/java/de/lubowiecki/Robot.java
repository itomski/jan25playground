package de.lubowiecki;

public class Robot {

    private String name;
    private int x;
    private int y;

    public Robot(String name) {
        this.name = name;
        // x und y starten bei 0
    }

    // Methodenparameter sind lokale Variablen
    public Robot(String name, int x, int y /*, int z */) {
        // name = lokale Variable (Methodenparameter)
        // this.name = Instanz Eigenschaft
        this.name = name;
        this.x = x;
        this.y = y;
        // this muss verwendet werden, wenn Eigenschaften und lokale Variablen gleich heißen
    }


    // public = Methode ist von überall verwendbar
    // void = Rückgabetyp. void heißt, es gibt keine Rückgabe
    // goUp = Name der Methode
    // () = Parameterklammer
    public void goUp() { // Alles innerhalb dieser Klammern gehört zu dieser Methode
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
