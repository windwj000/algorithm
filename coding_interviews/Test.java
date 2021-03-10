import java.util.*;

public class Test {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || size > num.length) {
            return res;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            maxheap.offer(num[i]);
        }
        res.add(maxheap.peek());
        for (int i = size; i < num.length; i++) {
            maxheap.remove(num[i - size]);  //注意，先 remove()
            maxheap.offer(num[i]);
            res.add(maxheap.peek());
        }
        return res;
    }
}
