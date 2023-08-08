package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.Tile;

import java.util.List;
import java.util.function.Consumer;

public abstract class AbstractListTileFactory<T extends Tile> implements TileFactory<T> {
    protected Consumer<List<T>> setterOnDestination;

    public AbstractListTileFactory(Consumer<List<T>> setterOnDestination) {
        this.setterOnDestination = setterOnDestination;
    }

    protected abstract List<T> generateTile(long string);
    public final void create(long id) {
        setterOnDestination.accept(this.generateTile(id));
    }
}
