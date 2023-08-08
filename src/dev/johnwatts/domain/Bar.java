package dev.johnwatts.domain;

public class Bar {
    private long id;
    private String cake;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "id=" + id +
                ", cake='" + cake + '\'' +
                '}';
    }
}
