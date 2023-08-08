package dev.johnwatts.dashboard.tiles;

import dev.johnwatts.domain.Foo;

public class FooTile implements Tile {
    private Foo foo;

    public FooTile(Foo foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "FooTile{" +
                "foo='" + foo + '\'' +
                '}';
    }
}
