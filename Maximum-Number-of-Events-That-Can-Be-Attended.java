class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,Comparator.comparing(o->o[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0, n = events.length, day = 1, count = 0;
        
        // Find the last day of all events
        int lastDay = 0;
        for (int[] event : events) {
            lastDay = Math.max(lastDay, event[1]);
        }
        for (day = 1; day <= lastDay; day++) {
            // Add all events starting today
            while (i < n && events[i][0] == day) {
                pq.offer(events[i][1]); // store endDay
                i++;
            }

            // Remove expired events
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }

            // Attend the event that ends earliest
            if (!pq.isEmpty()) {
                pq.poll();
                count++;
            }
        }
        return count;
    }
}