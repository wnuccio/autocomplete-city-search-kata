package minimumnumberofjumps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Dimensions:
    - array size: 0, 1, many
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
}
