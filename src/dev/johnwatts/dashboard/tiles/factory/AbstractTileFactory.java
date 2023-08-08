package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.Tile;

import java.util.function.Consumer;

public abstract class AbstractTileFactory<T extends Tile> implements TileFactory<T> {
    protected Consumer<T> setterOnDestination;

    public AbstractTileFactory(Consumer<T> setterOnDestination) {
        this.setterOnDestination = setterOnDestination;
    }

    protected abstract T generateTile(long string);
    public final void create(long id) {
        setterOnDestination.accept(this.generateTile(id));
    }
}
