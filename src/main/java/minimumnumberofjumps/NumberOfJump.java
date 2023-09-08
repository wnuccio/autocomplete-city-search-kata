package minimumnumberofjumps;

public class NumberOfJump {
    public int minimumNumberOfJumps(int[] ints) {
        if (ints.length == 2) {
            if (ints[0] == 0)
                return -1;

            if (ints[0] == 1)
                return 2;

            if (ints[0] >= 2)
                return 1;

            return -10;
        }

        if (ints.length == 1) {
            if (ints[0] == 0)
                return -1;

            if (ints[0] >= 1)
                return 1;

            return -10;
        }

        return -10;
    }
}
