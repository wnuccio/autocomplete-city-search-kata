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

    @Test
    void three_chars_input_matching_may_cities_returns_many_lines() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("arc", asList("Naples", "Barcelona", "Milan", "Paris"));

        assertEquals("a: Naples, Barcelona, Milan, Paris", output.get(0));
        assertEquals("ar: Barcelona, Paris", output.get(1));
        assertEquals("arc: Barcelona", output.get(2));
    }

    @Test
    void string_input_matching_may_cities_returns_many_lines_with_final_zero() {
        CitySearch citySearch = new CitySearch();

        List<String> output = citySearch.search("arca", asList("Naples", "Barcelona", "Milan", "Paris"));

        assertEquals("a: Naples, Barcelona, Milan, Paris", output.get(0));
        assertEquals("ar: Barcelona, Paris", output.get(1));
        assertEquals("arc: Barcelona", output.get(2));
        assertEquals("arca: 0", output.get(3));
    }

    @Test
    void acceptance_test_1() {
        CitySearch citySearch = new CitySearch();
        List<String> cities = asList("Las Palmas", "Pamplona", "Palencia", "Palma de Mallorca", "Ponferrada", "Calella de Palafrugell");

        List<String> output = citySearch.search("palma", cities);

        assertEquals("p: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Ponferrada, Calella de Palafrugell", output.get(0));
        assertEquals("pa: Las Palmas, Pamplona, Palencia, Palma de Mallorca, Calella de Palafrugell", output.get(1));
        assertEquals("pal: Las Palmas, Palencia, Palma de Mallorca, Calella de Palafrugell", output.get(2));
        assertEquals("palm: Las Palmas, Palma de Mallorca", output.get(3));
        assertEquals("palma: Las Palmas, Palma de Mallorca", output.get(4));
    }
}