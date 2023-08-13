import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

public class CitySearch {
    public List<String> search(String searchString, List<String> cities) {
        List<String> matches = findPotentialMatches(searchString, cities);

        if (thereIsNo(matches))
            return singletonList("0");

        return matches;
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
