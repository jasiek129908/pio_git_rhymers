package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_ERROR_CODE = -1;
    private static final int SIZE = 12;
    private static final int FULL_CHECK = 11;
    private int[] numbers = new int[SIZE];

    private int total = DEFAULT_ERROR_CODE;

    public static int getDefaultErrorCode() {
        return DEFAULT_ERROR_CODE;
    }

    public static int getSIZE() {
        return SIZE;
    }

    public static int getFullCheck() {
        return FULL_CHECK;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_ERROR_CODE;
    }

    public boolean isFull() {
        return total == FULL_CHECK;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_ERROR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_ERROR_CODE;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
    
}