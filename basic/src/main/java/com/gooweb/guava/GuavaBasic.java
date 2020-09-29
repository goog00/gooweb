package com.gooweb.guava;

import com.google.common.base.*;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/**
 * guava基础部分demo
 *
 * @author steng
 * @description
 * @date 2020-09-21 14:25
 **/
@Slf4j
public class GuavaBasic {


    @Test
    public void testJoiner() {

        List<String> list = Lists.newArrayList("zhangsan", "lisi", "wangwu");
        String delimiter = ",";

        log.info("传统方法:{}", joinWithStringBuilder(list, delimiter));

        log.info("采用guava的join:{}", joinWithGuava(list, delimiter));

    }

    private String joinWithGuava(List<String> list, String delimiter) {
        return Joiner.on(delimiter)//创建一个Joiner对象,将分隔符delimiter设为全局变量
                .skipNulls()//创建一个新的Joiner对象,复写其appendTo方法,用来过滤list中的空值
//                .useForNull("nullText")//使用nullText替换空字符串
                .join(list);//将list中的内容一个个的与delimiter分隔符连接起来
    }

    private String joinWithStringBuilder(List<String> list, String delimiter) {

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            if (s != null) {
                sb.append(s).append(delimiter);
            }
        }
        sb.setLength(sb.length() - delimiter.length());
        return sb.toString();
    }


    @Test
    public void testMapJoiner() {

        Map<String, String> map = Maps.newLinkedHashMap();

        String delimiter = ";";
        map.put("贝克汉姆", "中场");
        map.put("罗纳尔多", "前锋");
        map.put("布冯", "门将");
        map.put("齐达内", "中场");

        String returnString = Joiner.on(delimiter)
                .withKeyValueSeparator(":")//创建一个以:作为间隔符的MapJoiner
                .join(map);

        log.info(returnString);

    }

    /**
     * 将含有指定分隔符的字符串分开
     */
    @Test
    public void testSplitter() {
        String text = "英文|中文||韩文|法文|  xx  |";
        log.info(Arrays.toString(text.split("\\|")));

        log.info(Splitter.on("|")//创建一个以"|"作为切分的Splitter
                .trimResults()//对切分所有结果,去掉两边空格
                .split(text)//将字符串text按照"|"切分开来
                .toString());
    }


    /**
     * 把按照键值对规则组合起来的字符串,拆分成map对象
     */
    @Test
    public void testMapSplitter() {
        String text = "贝克汉姆:中场;罗纳尔多:前锋;布冯:门将;齐达内:中场";
        String delimiter = ";";
        Map<String, String> map = Splitter.on(delimiter)
                .withKeyValueSeparator(":").split(text);

        for (Map.Entry<String, String> e : map.entrySet()) {
            log.info("key为{},value={}", e.getKey(), e.getValue());
        }

    }


    /**
     * 指定字符集获取字符串byte 数组
     */
    @Test
    public void testCharsets() {
        String text = "编码问题";

        try {

            byte[] bytes = text.getBytes("utf-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //不需要捕获异常
        byte[] bytes = text.getBytes(Charsets.UTF_8);
    }


    @Test
    public void testStrings() {
        StringBuilder text = new StringBuilder("helloworld");

        char c = 'x';

        for (int i = 0; i < 3; i++) {
            text.append(c);
        }

        Assert.assertEquals(text.toString(), "helloworldxxx");

        String result = Strings.padEnd("helloworld", 13, c);

        Assert.assertEquals(result, "helloworldxxx");

        //如果是null,则转成""字符串,否则返回原始字符串,这是一个推荐使用的函数
        Assert.assertEquals(Strings.nullToEmpty(null), "");

        //如果字符串是""字符串,否则直接返回null
        Assert.assertNull(Strings.emptyToNull(""));

        //如果字符串是""字符串,或者是null,则返回true
        Assert.assertTrue(Strings.isNullOrEmpty("") && Strings.isNullOrEmpty(null));
    }


    @Test
    public void testCharMather() {
        String text = "My name is    loda, I'm a IT guy!";

        //将多个空格合并为一个空格
        String after = CharMatcher.WHITESPACE.collapseFrom(text, ' ');
        Assert.assertEquals(after, "My name is loda, I'm a IT guy!");

        String charWithNumber = "12xabd34";

        Assert.assertEquals(CharMatcher.JAVA_DIGIT.retainFrom(charWithNumber), "1234");
    }


    @Test
    public void testPrecondition() {
        int a = 10;
        Preconditions.checkArgument(a > 10, "参数必须大于10");
        Preconditions.checkNotNull(null, "不能为空");

    }

    @Test
    public void testMoreObjects() {

        Student s = new Student(1, null, "male", 13);

        //利用guava的toString格式化对象
        Assert.assertEquals(s.toString(), "Student{id=1, sex=male, age=13}");

        //查找第一个不为空的元素,如果是null,则抛出异常
        Assert.assertEquals(MoreObjects.firstNonNull(null, "jack"), "jack");

        Student s1 = new Student(1, "jack", "female", 13);
        Student s2 = new Student(1, "jack", "male", 14);
        Assert.assertTrue("检查s1是否小于s2", s1.compareTo(s2) < 0);
    }

    private class Student implements Comparable<Student> {

        public Student(int id, String name, String sex, int age) {
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        private int id;

        private String name;

        private String sex;

        private int age;


        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)//创建ToStringHelper对象
                    .omitNullValues()//忽略空值
                    .add("id", id)//将id添加入内
                    .add("name", name)//将name
                    .add("sex", sex)
                    .add("age", age)
                    .toString();//将ToStringHelper格式化为字符串内容
        }

        @Override
        public int compareTo(Student s) {
            //如果需要对多个值进行比较,以完成排序过程,典型的写法为:
            //return typicalCompare(s)
            //使用guava的写法
            return ComparisonChain.start().compare(this.id, s.id)
                    .compare(this.name, s.name)
                    .compare(this.sex, s.sex)
                    .compare(this.age, s.age)
                    .result();
        }

        @SuppressWarnings("unused")
        public int typicalCompare(Student s) {
            int result = this.id - s.id;

            if (result != 0) {
                return result;
            }
            result = this.name.compareTo(s.name);

            if (result != 0) {
                return result;
            }

            result = this.sex.compareTo(s.sex);

            if (result != 0) {
                return result;
            }

            return this.age - s.age;
        }


    }


}
