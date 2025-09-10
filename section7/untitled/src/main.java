import java.util.Collections;
import java.util.PriorityQueue;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    /**
     * Priority queue pattern for finding the Kth element or top K elements. "Top" elements could be any condition,
     * but typically they are finding the largest or smallest of a set of data.
     *
     * If you are finding the Kth element, you will be returning a single data type, typically integer.
     * If you are finding K elements, you will typically be returning an array or list data structure of elements.
     */
    public int pattern(int[] nums, int k) {
        PriorityQueue pq;

        // Finding the largest Kth element or largest K elements? By default, a priority queue will sort elements in
        // ascending order, so all you need to do is initialize a priority queue with an empty constructor.
        pq = new PriorityQueue<>();

        // Finding the smallest Kth element or smallest K elements? Reverse the comparator to have the
        // elements sorted in descending order!
        pq = new PriorityQueue<>(Collections.reverseOrder());

        // Loop over the elements in our input data.
        for (int num : nums) {
            pq.add(num);
            // As soon as our priority queue size goes over size k, we immediately remove the head in order to keep the
            // time complexity insertion to O(log(K)).
            if (pq.size() > k) pq.poll();
        }

        /*
         * Finding K elements? Loop over the elements in your priority queue and add them to your final result.
         * -------------------------------------------------
         * int[] result = new int[k];
         * for (int i = 0; i < k; i++) result[i] = pq.poll();
         *
         * return result;
         * -------------------------------------------------
         */

        // If you are finding the Kth element, we can just return whatever is at the top of
        // our priority queue.
        return pq.peek();
    }
}
