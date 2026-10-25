import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    l.add(order[i]);
                    break;
                }
            }
        }

        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}