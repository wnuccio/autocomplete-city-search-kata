package minimumnumberofjumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Dimensions:
    - array size: 1, many
    - array item: 0, 1, many
    - output: -1, 1, many
 */
public class NumberOfJumpTest {

    private NumberOfJump numJumps = new NumberOfJump();

    // [1] -> 1
    @Test
    void should_be_one_step_for_one_element() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{1});

        assertEquals(1, jumps);
    }

    // [0] -> 1
    // this because the first step is always counted, as it matches the first element,
    // while the last element does not count, since the end of the array is already reached
    @Test
    void should_be_one_step_for_one_zero_element() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{0});

        assertEquals(1, jumps);
    }

    // [3] -> 1
    @Test
    void should_be_one_step_for_one_element_greater_than_one() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{3});

        assertEquals(1, jumps);
    }

    // [1, 1] -> 2
    @Test
    void should_be_two_steps_for_two_elements() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{1, 2});

        assertEquals(2, jumps);
    }

    // [0, 1] -> 2
    @Test
    void should_be_minus_one_for_two_elements_when_first_is_zero() {
        NumberOfJump numJumps = new NumberOfJump();

        int jumps = numJumps.minimumNumberOfJumps(new int[]{0, 2});

        assertEquals(-1, jumps);
    }

    // [2, 1] -> 1
    @Test
    void should_be_one_for_two_elements_when_first_is_two() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{2, 1});

        assertEquals(1, jumps);
    }

    // [0, 1, 1] -> -1
    @Test
    void should_be_minus_one_for_three_elements_when_first_is_zero() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{0, 1, 1});

        assertEquals(-1, jumps);
    }

    // [1, 1, 1] -> 3
    @Test
    void should_be_three_for_three_elements_one_one_one() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{1, 1, 1});

        assertEquals(3, jumps);
    }

    // [1, 2, 1] -> 3
    @Test
    void should_be_two_for_three_elements_one_two_one() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{1, 2, 1});

        assertEquals(2, jumps);
    }

    // [2, 1, 1] -> 3
    @Test
    void should_be_two_for_three_elements_two_one_one() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{2, 1, 1});

        assertEquals(2, jumps);
    }

    // [1, 0, 1] -> 3
    @Test
    void should_be_minus_one_for_three_elements_with_zero_as_second() {
        int jumps = numJumps.minimumNumberOfJumps(new int[]{1, 0, 1});

        assertEquals(-1, jumps);
    }


}
