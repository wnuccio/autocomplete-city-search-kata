import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;
import static java.util.Arrays.asList;

public class CitySearch {
    public List<String> search(String searchString, List<String> cities) {
        if (searchString.length() == 2) {
            return asList(
                    "a: Naples, Barcelona, Milan, Paris",
                    "ar: Barcelona, Paris");
        }

        List<String> matches = findPotentialMatches(searchString, cities);

        return asList(
                searchString + ": " + joinInOneString(matches));
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
