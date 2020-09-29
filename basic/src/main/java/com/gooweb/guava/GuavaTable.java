package com.gooweb.guava;

import com.google.common.collect.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;

/**
 * @author steng
 * @description
 * @date 2020-09-22 10:50
 **/
@Slf4j
public class GuavaTable {


    @Test
    public void tableTest() {

        Table<String, Integer, String> table = HashBasedTable.create();

        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                table.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }

        System.out.println(table.column(2));
        System.out.println(table.row("B"));
//        System.out.println(table.get("B",2));
    }


    @Test
    public void list() {
        List<String> strings = Lists.newArrayList("one", "two", "three", "one", "three");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    @Test
    public void immutableList() {
        List<String> list = ImmutableList.of("one", "two", "three", "one", "three");
        list = ImmutableList.copyOf(list);

        for (String str : list) {
            System.out.println(str);
        }
    }


    @Test
    public void set() {

        Set<String> set = Sets.newHashSet("one", "two", "three", "one");
        set = ImmutableSet.copyOf(set);

        for (String str : set) {
            System.out.println(str);
        }
    }


    /**
     * 可重复无序的集合
     */
    @Test
    public void multiset() {
        Multiset<String> multiset = HashMultiset.create();

        multiset.add("one");
        multiset.add("two");
        multiset.add("one");

        //查看元素个数
        int one = multiset.count("one");
        log.info("one的个数={}", one);
        //返回去重set
        Set<String> rawSet = multiset.elementSet();

        for (String str : rawSet) {
            System.out.println(str);
        }

    }


    //############map使用############

    @Test
    public void map() {
        HashMap<String, String> map = Maps.newHashMap(ImmutableMap.of("one", "1", "two", "2"));

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry entry : entries) {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }

    }

    /**
     * 不可变映射
     */
    @Test
    public void immutableMap() {
        Map<String, String> map = ImmutableMap.of("one", "1", "two", "2");

    }

    /**
     * key 和 value 相互映射
     */
    @Test
    public void biMap() {
        HashMap<String, String> map = Maps.newHashMap(ImmutableMap.of("one", "1", "two", "2"));

        ImmutableBiMap<String, String> biMap = ImmutableBiMap.copyOf(map);

        Set<Map.Entry<String, String>> entries = biMap.entrySet();

        for (Map.Entry entry : entries) {
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }


        ImmutableBiMap<String, String> afterInverseBiMap = biMap.inverse();


        Set<Map.Entry<String, String>> entries1 = afterInverseBiMap.entrySet();

        for (Map.Entry entry : entries1) {
            System.out.println("after inverse key=" + entry.getKey() + " value=" + entry.getValue());
        }

    }


    @Test
    public void multiMap(){

        /*
         * HashMultimap：key-value键值对不可重复;
         * LinkedHashMultimap: key-value键值对不可重复，且value顺序为添加顺序;
         * TreeMultimap：key-value键值对不可重复，key和value按会自然或指定排序;
         * ArrayListMultimap：key-value键值对可重复，使用ArrayList存储value, value顺序为添加的顺序，相同key中的value有序可重复;
         * LinkedListMultimap：key-value键值对可重复，key和value均有序;
         *
         */

        Multimap<String,String> hashMultimap = HashMultimap.create();
        hashMultimap.put("two","2");
        hashMultimap.put("one","first");
        hashMultimap.put("one","1");
        hashMultimap.put("one","first");

        //转为常规map
        Map<String,Collection<String>> listMap = hashMultimap.asMap();

        List<String> list1 = (List<String>) listMap.get("one");

    }

    public void test12(){

    }









}
