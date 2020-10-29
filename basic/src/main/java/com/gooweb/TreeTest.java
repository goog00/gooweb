package com.gooweb;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author steng
 * @description
 * @date 2020-10-13 09:48
 **/
public class TreeTest {

    public static void list(List<Node> nodeList, List<Node> helpNodeList,
                            Map<Integer, Integer> KPointIdVQCountMap,
                            Integer questionCount) {
        //把章节点tree 展开
        for (Node node : nodeList) {

            if (node.getLevel() == 4) {
                //知识点的题目数量
                Integer count = KPointIdVQCountMap.get(node.getId());
                node.setNum(count);
                questionCount += count;
            }

            //该节点是否有子tree
            List<Node> child = node.getChild();
            if (CollectionUtils.isEmpty(child)) {
                //如果没有,直接返回
                return;
            }
            //否则,递归调用
            helpNodeList = child;
            list(nodeList, helpNodeList, KPointIdVQCountMap, questionCount);

        }
    }

    public static void main(String[] args) {

        Node node = new Node();
        node.setId(1);
        node.setLevel(1);
        node.setName("a");

        Node node2 = new Node();
        node2.setId(2);
        node2.setLevel(2);
        node2.setName("b");

        Node node3 = new Node();
        node3.setId(3);
        node3.setLevel(3);
        node3.setName("c");

        Node node4 = new Node();
        node4.setId(4);
        node4.setLevel(4);
        node4.setName("d");

        List<Node> list2 = Lists.newArrayList();
        list2.add(node2);
        node.setChild(list2);

        List<Node> list3 = Lists.newArrayList();
        list3.add(node2);
        list3.add(node4);
        node2.setChild(list3);

        List<Node> helpList = Lists.newArrayList();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(3,30);
        map.put(4,40);
        Integer count = 0;
        list(Arrays.asList(node), helpList,map,count);
    }

}


@Data
class Node {

    Integer id;
    String name;

    Integer num;

    Integer level;

    List<Node> child;

}
