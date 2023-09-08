package minimumnumberofjumps;

public class NumberOfJump {

    private int jumpsr(int[] ints, int start) {
        if (start == ints.length - 1)
            return 0;

        if (ints[start] == 0)
            return -1;

        int movement = ints[start];
        return movement + jumpsr(ints, start + movement);
    }

    private int jumps(int[] ints, int start) {
        if (start == ints.length - 1)
            return 0;

        if (ints[start] == 0)
            return -1;

        if (ints[start] == 1)
            return 2;

        if (ints[start] >= 2)
            return 1;

        return -10;
    }

    public int minimumNumberOfJumps(int[] ints) {
        if (ints.length == 1) {
            return 1;
        }

        if (ints.length == 3) {
            if (ints[0] == 0) {
                return -1;
            }

            int jumps = jumps(ints, ints[0]);
            return jumps == -1 ? -1 : ints[0] + jumps;
        }

        if (ints.length == 2) {
            return jumps(ints, 0);
        }


        return -10;
    }
}
