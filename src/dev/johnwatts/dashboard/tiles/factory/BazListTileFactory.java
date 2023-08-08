package dev.johnwatts.dashboard.tiles.factory;

import dev.johnwatts.dashboard.tiles.BazTile;
import dev.johnwatts.database.Database;

import java.util.List;
import java.util.function.Consumer;

public class BazListTileFactory extends AbstractListTileFactory<BazTile> {
    public BazListTileFactory(Consumer<List<BazTile>> setterOnDestination) {
        super(setterOnDestination);
    }

    @Override
    protected List<BazTile> generateTile(long id) {
        return List.of(new BazTile(Database.getBaz(id)), new BazTile(Database.getBaz(id + 1)));
    }
}

