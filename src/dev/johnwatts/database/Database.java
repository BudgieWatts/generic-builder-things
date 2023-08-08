package dev.johnwatts.database;

import dev.johnwatts.domain.Bar;
import dev.johnwatts.domain.Baz;
import dev.johnwatts.domain.Foo;

public class Database {
    public static Foo getFoo(long id) {
        String[] flavours = {
                "Chocolate",
                "Banana",
                "Lemon",
                "Orange",
                "Peach",
                "Ginger",
                "Honey",
                "Apricot",
                "Pear",
                "Cranberry",
                "Blood orange",
                "Anise",
                "Lime",
                "Cinnamon"
        };
        String[] colours = {
                "Green",
                "Blue",
                "Red",
                "Yellow",
                "Orange",
                "Purple",
                "Grey",
                "Magenta",
                "Aquamarine",
                "Beige",
                "Violet",
                "Maroon",
                "Indigo",
                "Azure",
                "Crimson",
                "Lime",
                "Olive",
                "Silver",
                "Teal",
                "Burgundy",
                "Blue-green",
                "Vermilion"
        };
        Foo foo = new Foo();
        foo.setId(id);
        foo.setColour(selectItem(id, colours));
        foo.setFlavour(selectItem(id, flavours));
        return foo;
    }

    public static Bar getBar(long id) {
        String[] cakes = {
                "Amygdalopita",
                "Angel food",
                "Applesauce cake",
                "Avocado cake",
                "Babka Wielkanocna",
                "Ballokume",
                "Banana cake",
                "Bara brith",
                "Basbousa",
                "Batik cake",
                "Battenberg cake",
                "Baumkuchen",
                "Beer cake",
                "Berlingozzo",
                "Better than",
                "Bibikkan",
                "Bibingka",
                "Bienenstich",
                "Birthday Cake",
                "Biscoff cake",
                "Bizcocho Dominicano",
                "Black Forest",
                "Blackout cake",
                "Bolo de",
                "Madeleine",
                "Boston cream",
                "Brazil nut",
                "Brazo de",
                "Broy",
                "Brownie",
                "Bublanina",
                "Buccellato",
                "Buche de",
                "Budapestl",
                "Buko pandan",
                "Bundt cake",
                "Bustrengo",
                "Butter cake",
                "Butterfly cake",
                "Butterkuchen",
                "Carrot cake",
                "Cassata",
                "Cassatella di",
                "Cassava cake",
                "Castagnaccio",
                "Castella",
                "Caterpillar cake",
                "Charlotte",
                "Cheesecake",
                "United States",
                "Chestnut cake",
                "Chhena poda",
                "Chiffon cake",
                "Chocolate cake",
                "Chocotorta",
                "Christmas cake",
                "Clementine cake",
                "Coconut cake"
        };
        Bar bar = new Bar();
        bar.setId(id);
        bar.setCake(selectItem(id, cakes));
        return bar;
    }

    public static Baz getBaz(long id) {
        String[] names = {
                "Elijah",
                "James",
                "William",
                "Oliver",
                "Noah",
                "Olivia",
                "Amelia",
                "Jack",
                "Charlie",
                "Emma",
                "Thomas",
                "Henry",
                "Benjamin",
                "Mia",
                "Grace",
                "Isabella",
                "Evelyn",
                "Sophia",
                "Jacob",
                "Alice",
                "Alexander",
                "Theodore",
                "Lucas",
                "Anna"
        };
        Baz baz = new Baz();
        baz.setId(id);
        baz.setAge((int) id % 70 + 10);
        baz.setName(selectItem(id, names));
        return baz;
    }

    private static String selectItem(long id, String[] items) {
        return items[(int) id % items.length];
    }
}
