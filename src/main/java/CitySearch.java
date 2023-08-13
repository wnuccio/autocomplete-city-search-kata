import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class CitySearch {
    public List<String> search(String searchString, List<String> cities) {
        ArrayList<String> output = new ArrayList<>();
        for (int ch = 1; ch <= searchString.length(); ch++) {
            String searchSubString = extractSubStringFrom(searchString, ch);
            List<String> matches = findPotentialMatches(searchSubString, cities);
            String row = buildOutputRow(searchSubString, matches);
            output.add(row);
        }
        return output;
    }

    private String extractSubStringFrom(String searchString, int ch) {
        return searchString.substring(0, ch);
    }

    private List<String> findPotentialMatches(String searchSubString, List<String> cities) {
        ArrayList<String> matches = new ArrayList<>();

        for (String city : cities) {
            if (city.contains(searchSubString))
                matches.add(city);
        }
        return matches;
    }

    private String buildOutputRow(String searchSubString, List<String> matches) {
        String matchesString = joinInOneString(matches);
        return searchSubString + ": " + matchesString;
    }

    private String joinInOneString(List<String> matches) {
        if (thereIsNo(matches))
            return "0";

        return join(", ", matches);
    }

    private boolean thereIsNo(List<String> matches) {
        return matches.isEmpty();
    }
}
