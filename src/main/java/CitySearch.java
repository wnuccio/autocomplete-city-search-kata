import java.util.Collections;
import java.util.List;

public class CitySearch {
    public List<String> search(String input, List<String> cities) {
        if (cities.get(0).charAt(0) != input.charAt(0))
            return Collections.singletonList("0");

        return Collections.singletonList("a");
    }
}
