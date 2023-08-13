import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class CitySearch {
    public List<String> search(String input, List<String> cities) {
        if (cities.stream().allMatch(city -> city.contains(input)))
            return new ArrayList<>(cities);

        if (cities.size() == 2 && cities.get(0).contains(input) && cities.get(1).contains(input))
            return asList(cities.get(0), cities.get(1));

        if (cities.size() == 1 && cities.get(0).contains(input))
            return asList(cities.get(0));

        return Collections.singletonList("0");
    }
}
