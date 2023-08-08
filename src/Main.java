import dev.johnwatts.dashboard.factory.DashboardFactory;

import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        LongStream.rangeClosed(0, 1000).mapToObj(DashboardFactory::create)
                        .forEach(System.out::println);
    }
}