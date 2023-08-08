package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.BarTile;
import dev.johnwatts.database.Database;

import java.util.function.Consumer;

public class BarTileFactory extends AbstractTileFactory<BarTile> {

    public BarTileFactory(Consumer<BarTile> setterOnDestination) {
        super(setterOnDestination);
    }

    @Override
    protected BarTile generateTile(long id) {
        return new BarTile(Database.getBar(id));
    }
}
