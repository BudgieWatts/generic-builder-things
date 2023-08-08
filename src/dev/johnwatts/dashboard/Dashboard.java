package dev.johnwatts.dashboard;

import dev.johnwatts.dashboard.tiles.BarTile;
import dev.johnwatts.dashboard.tiles.BazTile;
import dev.johnwatts.dashboard.tiles.FooTile;

import java.util.List;

public class Dashboard {
    private FooTile fooTile;
    private BarTile barTile;
    private List<BazTile> bazTiles;

    public void setFooTile(FooTile fooTile) {
        this.fooTile = fooTile;
    }

    public void setBarTile(BarTile barTile) {
        this.barTile = barTile;
    }

    public void setBazTiles(List<BazTile> bazTiles) {
        this.bazTiles = bazTiles;
    }

    public FooTile getFooTile() {
        return fooTile;
    }

    public BarTile getBarTile() {
        return barTile;
    }

    public List<BazTile> getBazTile() {
        return bazTiles;
    }

    @Override
    public String toString() {
        return "Dashboard{\n" +
                "\tfooTile=" + fooTile +
                "\n\tbarTile=" + barTile +
                "\n\tbazTile=" + bazTiles.toString() +
                '}';
    }
}
