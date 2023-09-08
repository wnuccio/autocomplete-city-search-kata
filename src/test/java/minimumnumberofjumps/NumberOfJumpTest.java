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

    // [1] -> 1
    @Test
    void should_be_one_step_for_one_element() {
        NumberOfJump numJumps = new NumberOfJump();

        int jumps = numJumps.minimumNumberOfJumps(new int[]{1});

        assertEquals(1, jumps);
    }

    // [0] -> -1
    @Test
    void should_be_minus_one_step_for_one_zero_element() {
        NumberOfJump numJumps = new NumberOfJump();

        int jumps = numJumps.minimumNumberOfJumps(new int[]{0});

        assertEquals(-1, jumps);
    }

    // [3] -> 1
    @Test
    void should_be_one_step_for_one_element_greater_than_one() {
        NumberOfJump numJumps = new NumberOfJump();

        int jumps = numJumps.minimumNumberOfJumps(new int[]{3});

        assertEquals(1, jumps);
    }

    // [1, 1] -> 2
    @Test
    void should_be_two_steps_for_two_elements() {
        NumberOfJump numJumps = new NumberOfJump();

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
        NumberOfJump numJumps = new NumberOfJump();

        int jumps = numJumps.minimumNumberOfJumps(new int[]{2, 1});

        assertEquals(1, jumps);
    }


}
