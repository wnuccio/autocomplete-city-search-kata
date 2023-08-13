import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CitySearchTest {


    @Test
    void one_char_input_matching_one_char_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("a"));

        assertEquals(asList("a: a"), output);
    }

    @Test
    void one_char_input_not_matching_one_char_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("b"));

        assertEquals(asList("a: 0"), output);
    }

    @Test
    void one_char_input_matching_one_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("Naples"));

        assertEquals(asList("a: Naples"), output);
    }

    @Test
    void one_char_input_not_matching_one_city() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("b", asList("Naples"));

        assertEquals(asList("b: 0"), output);
    }

    @Test
    void one_char_input_matching_two_cities() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", asList("Naples", "Barcelona"));

        assertEquals(asList("a: Naples, Barcelona"), output);
    }

    @Test
    void one_char_input_matching_some_cities() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("r", asList("Naples", "Barcelona", "Milan", "Paris"));

        assertEquals(asList("r: Barcelona, Paris"), output);
    }

    @Test
    void one_char_input_not_matching_empty_city_list() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("a", Collections.emptyList());

        assertEquals(asList("a: 0"), output);
    }

}