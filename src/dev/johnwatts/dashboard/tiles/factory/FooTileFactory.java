package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.FooTile;
import dev.johnwatts.database.Database;

import java.util.function.Consumer;

public class FooTileFactory extends AbstractTileFactory<FooTile> {

    public FooTileFactory(Consumer<FooTile> setterOnDestination) {
        super(setterOnDestination);
    }

    @Override
    protected FooTile generateTile(long id) {
        return new FooTile(Database.getFoo(id));
    }

}
