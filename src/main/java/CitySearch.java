import java.util.ArrayList;
import java.util.List;

import static java.lang.String.join;

public class CitySearch {
    public List<String> search(String searchString, List<String> cities) {
        ArrayList<String> output = new ArrayList<>();
        for (int ch = 1; ch <= searchString.length(); ch++) {
            String row = buildOutputRow(searchString, ch, cities);
            output.add(row);
        }
        return output;
    }

    private String buildOutputRow(String searchString, int currentChar, List<String> cities) {
        String searchSubString = searchString.substring(0, currentChar);
        String row = searchSubString + ": " + allMatchesInOneString(searchSubString, cities);
        return row;
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
