import java.util.Collections;
import java.util.List;

public class CitySearch {
    public List<String> search(String input, List<String> cities) {
        if (cities.get(0).contains(input))
            return Collections.singletonList(cities.get(0));

        return Collections.singletonList("0");
    }
}
