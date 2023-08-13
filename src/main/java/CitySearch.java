import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CitySearch {
    public List<String> search(String input, List<String> cities) {
        if (cities.stream().allMatch(city -> city.contains(input)))
            return new ArrayList<>(cities);

        return Collections.singletonList("0");
    }
}
