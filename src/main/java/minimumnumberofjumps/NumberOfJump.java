package minimumnumberofjumps;

public class NumberOfJump {

    private int jumpsr(int[] ints, int start) {
        assert ints.length > 0;
        assert start >= 0;

        // end of the array
        if (start == ints.length - 1)
            return 0;

        int movement = ints[start];

        // impossible to go on
        if (movement == 0) {
            return -1;
        }

        int newStart = Math.min(start + movement, ints.length - 1);
        int nextJumps = jumpsr(ints, newStart);

        if (nextJumps == -1)
            return -1;

        return 1 + nextJumps;
    }

    public int minimumNumberOfJumps(int[] ints) {
        if (ints.length == 1) {
            return 1;
        }

        int jumps = jumpsr(ints, 0);

        if (jumps == -1)
            return -1;

        return 1 + jumps;
    }
}
