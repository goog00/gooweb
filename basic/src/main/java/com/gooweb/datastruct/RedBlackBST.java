package com.gooweb.datastruct;

import com.googoo.pattern.factory.BlackHuman;

/**
 * @author steng
 * @description red black tree
 * @date 2019-12-12 9:10 下午
 **/
public class RedBlackBST<Key extends Comparable<Key>,Value> {



    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private Node root;



    private class Node {
      Key key;//健
      Value val;//相关联的值
      Node left,right;//左右子树
      int N;//这颗树中的结点数
      boolean color;//由父结点指向它的链接的颜色

      Node(Key key,Value val,int N,boolean color){
          this.key = key;
          this.val = val;
          this.N = N;
          this.color = color;
      }

    }

    private boolean isRed(Node x){
      if(x == null){
          return false;
      }
      return x.color == RED;
    }

    private Node rotateLeft(Node h){
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
//        h.N = 1 + size
        return x;

    }

    private Node rotateRight(Node h){
        //1、save the left of h node reference x
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        x.N = h.N;
        return x;
    }

    private void flipColors(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    public void put(Key key,Value val){
        root = put(root,key,val);
        root.color = BLACK;

    }

    private Node put(Node h,Key key,Value val){
        if(h == null){
            return new Node(key,val,1,RED);
        }
        int cmp = key.compareTo(h.key);
        if(cmp < 0){
            h.left = put(h.left,key,val);

        } else if(cmp > 0){
            h.right = put(h.right,key,val);
        } else{
            h.val = val;
        }

        //将任意含有红色右链接的3-结点（或临时的4-结点）向左旋转
        if(isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }
        //将临时的4-结点中两条连续红链接中的上层链接向右旋转
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        //进行颜色转换
        if(isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }

        return h;
    }



}
