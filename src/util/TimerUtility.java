package util;

import java.util.Arrays;

public class TimerUtility {

    public static <T> String measureExecutionTime(TimedTask<T> task) {
        long startTime = System.nanoTime();
        T result = task.execute();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        return "Elapsed Time: " + elapsedTime + " ns\nResult: " + formatResult(result);
    }

    private static <T> String formatResult(T result) {
        return switch (result) {
            case int[] integers -> Arrays.toString(integers);
            case long[] longs -> Arrays.toString(longs);
            case double[] doubles -> Arrays.toString(doubles);
            case boolean[] booleans -> Arrays.toString(booleans);
            case Object[] objects -> Arrays.toString(objects);
            case null, default -> {
                assert result != null;
                yield result.toString();
            }
        };
    }
}
