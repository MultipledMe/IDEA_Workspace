package week11;

public enum Color {
    RED("R",0),GREEN("G",1),BLUE("B",2),WHITE("W",4);

    private String name;
    private int index;
    Color(String name, int index) {
        this.name = name;
        this.index= index;
    }
}
