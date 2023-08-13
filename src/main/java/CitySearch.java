import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;
import static java.util.Arrays.asList;

public class CitySearch {
    public List<String> search(String searchString, List<String> cities) {
        if (searchString.length() == 3) {
            return asList(
                    searchString.substring(0, 1) + ": " + allMatchesInOneString(searchString.substring(0, 1), cities),
                    searchString.substring(0, 2) + ": " + allMatchesInOneString(searchString.substring(0, 2), cities),
                    searchString.substring(0, 3) + ": " + allMatchesInOneString(searchString.substring(0, 3), cities));
        }

        if (searchString.length() == 2) {
            return asList(
                    searchString.substring(0, 1) + ": " + allMatchesInOneString(searchString.substring(0, 1), cities),
                    searchString.substring(0, 2) + ": " + allMatchesInOneString(searchString.substring(0, 2), cities));
        }

        if (searchString.length() == 1) {
            return asList(
                    searchString.substring(0, 1) + ": " + allMatchesInOneString(searchString.substring(0, 1), cities));
        }

        throw new UnsupportedOperationException();
    }

    private String allMatchesInOneString(String searchString, List<String> cities) {
        List<String> potentialMatches = findPotentialMatches(searchString, cities);
        return joinInOneString(potentialMatches);
    }

    private String joinInOneString(List<String> matches) {
        if (thereIsNo(matches))
            return "0";

        return join(", ", matches);
    }

    private List<String> findPotentialMatches(String input, List<String> cities) {
        ArrayList<String> matches = new ArrayList<>();

        for (String city : cities) {
            if (city.contains(input))
                matches.add(city);
        }
        return matches;
    }

    private boolean thereIsNo(List<String> matches) {
        return matches.isEmpty();
    }
}
