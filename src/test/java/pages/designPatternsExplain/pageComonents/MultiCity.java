package pages.designPatternsExplain.pageComonents;

import pages.designPatternsExplain.abstractComponent.SearchFlights;

public class MultiCity implements SearchFlights {
    @Override
    public void checkAvailabilityFlights(String origin, String destination) {
        System.out.println("I am in MultiCity trip");
    }
}
