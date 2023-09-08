package minimumnumberofjumps;

public class NumberOfJump {
    public int minimumNumberOfJumps(int[] ints) {
        if (ints[0] == 0)
            return -1;

        if (ints[0] >= 1)
            return 1;

        return -10;
    }
}
