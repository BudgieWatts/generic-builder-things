package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.Tile;

public interface TileFactory <T extends Tile> {
    void create(long id);
}
