package com.gooweb.leetcode.difficult;

import java.util.HashMap;
import java.util.LinkedHashSet;

/**
 * 460 LFU 缓存
 * 设计并实现最不经常使用（LFU）缓存的数据结构。它应该支持以下操作：get 和 put。
 *
 * get(key) - 如果键存在于缓存中，则获取键的值（总是正数），否则返回 -1。
 * put(key, value) - 如果键不存在，请设置或插入值。当缓存达到其容量时，它应该在插入新项目之前，
 * 使最不经常使用的项目无效。在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，最近最少使用的键将被去除。
 *
 * 进阶：
 * 你是否可以在 O(1) 时间复杂度内执行两项操作？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lfu-cache
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *
 * LRU和LFU是不同的!
 *
 * LRU是最近最少使用页面置换算法(Least Recently Used),也就是首先淘汰最长时间未被使用的页面!
 *
 * LFU是最近最不常用页面置换算法(Least Frequently Used),也就是淘汰一定时期内被访问次数最少的页!
 *
 * 比如,第二种方法的时期T为10分钟,如果每分钟进行一次调页,主存块为3,若所需页面走向为2 1 2 1 2 3 4
 *
 * 注意,当调页面4时会发生缺页中断
 *
 * 若按LRU算法,应换页面1(1页面最久未被使用) 但按LFU算法应换页面3(十分钟内,页面3只使用了一次)
 *
 * 可见LRU关键是看页面最后一次被使用到发生调度的时间长短,
 *
 * 而LFU关键是看一定时间段内页面被使用的频率!
 *
 * 参考：
 * https://leetcode.com/problems/lfu-cache/discuss/94521/JAVA-O(1)-very-easy-solution-using-3-HashMaps-and-LinkedHashSet
 * @author sunteng
 * @create 2019-08-26 下午 7:27
 **/
public class LFUCache_460 {

    //
    private HashMap<Integer,Integer> vals;
    //使用次数
    private HashMap<Integer,Integer> counts;
    //使用频率：key --> 使用的次数；value--> 对应 使用次数的key
    private HashMap<Integer, LinkedHashSet<Integer>> lists;

    int cap;
    //最小使用次数
    int min = -1;
    public LFUCache_460(int capacity){
        //容量大小
        cap = capacity;
        //缓存数据
        vals = new HashMap<>();
        counts = new HashMap<>();
        lists = new HashMap<>();
        lists.put(1,new LinkedHashSet<>());
    }


    /**
     *
     * @param key
     * @return
     */
    public int get(int key){
        if(!vals.containsKey(key)){
            return -1;
        }
        //使用次数
        int count = counts.get(key);
        //使用次数+1
        counts.put(key,count + 1);
        //
        lists.get(count).remove(key);//去掉使用次数为count的key
        if(count == min && lists.get(count).size() == 0) {
            min++;
        }

        if(!lists.containsKey(count + 1)){//如果还没有使用次数为count+1 的数据，先初始化一条；
            lists.put(count + 1,new LinkedHashSet<>());
        }

        lists.get(count + 1).add(key);//当key使用之后，更新key 的使用频率
        return vals.get(key);
    }

    public void put(int key,int value){
        if(cap <= 0){
            return;
        }
        if(vals.containsKey(key)){
            vals.put(key,value);
            get(key);
            return;
        }
        //超出缓存的容量
        if(vals.size() >= cap){
            //取出当前最小使用次数的元素，并从使用频率容器中删除
            int evit = lists.get(min).iterator().next();
            lists.get(min).remove(evit);
            vals.remove(evit);//从缓存容器中删除
        }

        vals.put(key,value);
        counts.put(key,1);
        min = 1;//
        lists.get(1).add(key);

    }

    public static void main(String[] args) {
        LFUCache_460 cache = new LFUCache_460( 2 /* capacity (缓存容量) */ );

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回 1
        cache.put(3, 3);    // 去除 key 2
        cache.get(2);       // 返回 -1 (未找到key 2)
        cache.get(3);       // 返回 3
        cache.put(4, 4);    // 去除 key 1
        cache.get(1);       // 返回 -1 (未找到 key 1)
        cache.get(3);       // 返回 3
        cache.get(4);       // 返回 4

    }
}
