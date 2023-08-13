import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CitySearchTest {


    @Test
    void one_input_char_matching_one_char_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("a"));

        assertEquals(asList("a"), output);
    }

    @Test
    void one_input_char_not_matching_one_char_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("b"));

        assertEquals(asList("0"), output);
    }
}