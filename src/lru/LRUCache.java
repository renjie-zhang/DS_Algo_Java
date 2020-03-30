package lru;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {

    // store keys of cache
    static Deque<Integer> dq;
    // store references of key in cache
    static HashSet<Integer> map;
    // max capacity of cache
    static int maxsize;

    LRUCache(int n){
        dq = new LinkedList<>();
        map = new HashSet<>();
        maxsize = n;
    }

    /***
     * refer key x with oin the LRU cache
     * @param x value
     */
    public void refer(int x){
        if (!map.contains(x)){
            if (dq.size() == maxsize){
                int last = dq.removeLast();
                map.remove(last);
            }
        }else {
            int index = 0, i = 0;
            Iterator<Integer> iterator = dq.iterator();
            while (iterator.hasNext()){
                if (iterator.next() == x){
                    index = i;
                    break;
                }
                i++;
            }
            dq.remove(index);
        }
        dq.push(x);
        map.add(x);
    }

    public void display(){
        Iterator<Integer> iterator = dq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"");
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.display();
    }

}
