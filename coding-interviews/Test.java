public class Test {
    public void reOrderArray(int[] array) {
        int[] tmp = new int[array.length];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isEven(array[i]))
                tmp[idx++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i]))
                tmp[idx++] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp[i];
        }
    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
