package dev.johnwatts.dashboard.tiles;

import dev.johnwatts.domain.Baz;

public class BazTile implements Tile {
private Baz baz;

    public BazTile(Baz baz) {
        this.baz = baz;
    }

    @Override
    public String toString() {
        return "BazTile{" +
                "baz=" + baz +
                '}';
    }
}
