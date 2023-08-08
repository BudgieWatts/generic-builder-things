package dev.johnwatts.domain;

public class Foo {
    private long id;
    private String colour;
    private String flavour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", colour='" + colour + '\'' +
                ", flavour='" + flavour + '\'' +
                '}';
    }
}
