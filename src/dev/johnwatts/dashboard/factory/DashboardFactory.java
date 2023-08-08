package dev.johnwatts.dashboard.factory;

import dev.johnwatts.dashboard.Dashboard;
import dev.johnwatts.dashboard.tiles.*;
import dev.johnwatts.dashboard.tiles.factory.BarTileFactory;
import dev.johnwatts.dashboard.tiles.factory.BazListTileFactory;
import dev.johnwatts.dashboard.tiles.factory.FooTileFactory;
import dev.johnwatts.dashboard.tiles.factory.TileFactory;

import java.util.List;

public class DashboardFactory {
    public static Dashboard create(long id) {
        Dashboard dashboard = new Dashboard();

        createTileFactories(dashboard).forEach(
                tileFactory -> tileFactory.create(id)
        );
        return dashboard;
    }

    private static List<TileFactory<? extends Tile>>  createTileFactories(Dashboard destination) {
     return List.of(
                new FooTileFactory(destination::setFooTile),
                new BarTileFactory(destination::setBarTile),
                new BazListTileFactory(destination::setBazTiles)
        );
    }
}
