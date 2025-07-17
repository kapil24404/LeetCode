class LRUCache {
    int capacity;
    Queue<Integer> q=new LinkedList<>();
    HashMap<Integer,Integer> hm=new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            q.remove(key);
            q.add(key);
            return hm.get(key);
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            q.remove(key);
            q.add(key);
            hm.put(key,value);
        }
        else{
            if(q.size()>=capacity){
                int lru = q.remove(); 
                hm.remove(lru);
            }
            q.add(key);
            hm.put(key,value);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */