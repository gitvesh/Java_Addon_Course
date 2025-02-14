package day4;

public class person {
    public person(String name) {
        this.name = name;
    }

    private String name;
    public  boolean equals(person eq)
    {
        return eq.name.equals(this.name);
    }

    public static void main(String[] args) {

    }

}
