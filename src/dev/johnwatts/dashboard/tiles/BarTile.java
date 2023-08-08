package dev.johnwatts.dashboard.tiles;

import dev.johnwatts.domain.Bar;

public class BarTile implements Tile {
private Bar bar;

    public BarTile(Bar bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "BarTile{" +
                "bar=" + bar +
                '}';
    }
}
