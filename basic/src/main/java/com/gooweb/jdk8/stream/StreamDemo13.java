package com.gooweb.jdk8.stream;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author steng
 * @description
 * @date 2020-10-30 09:51
 **/
public class StreamDemo13 {

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");
    List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));


    /**
     * 1.找出2011年发生的所有交易，并按交易额排序（从低到高）
     */
    public void test() {
        List<Transaction> tr2011 = transactions.stream() // 筛选出2011年发生的所有交易
                .filter(transaction -> transaction.getYear() == 2011) // 按照交易额从低到高排序
                .sorted(Comparator.comparing(Transaction::getValue)) // 转为集合
                .collect(Collectors.toList());
    }

    /**
     * 2. 交易员都在哪些不同的城市工作过？
     */
    public void test2() {

        List<String> cities = transactions.stream()
                // 提取出交易员所工作的城市
                .map(transaction -> transaction.getTrader().getCity())
                // 去除已有的城市
                .distinct()
                //将Stream中所有的元素转为一个List集合
                .collect(Collectors.toList());

    }

    /**
     * 3.查找所有来自于剑桥的交易员，并按姓名排序
     */
    public void test3() {

        List<Trader> traders = transactions.stream()
                //从交易中提取出所有 的交易员
                .map(Transaction::getTrader)
                //进行选择位于剑桥的交易员
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                //确保没有重复
                .distinct()
                //对生成的交易员流按照姓名进行排序
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

    }

    /**
     * 4.返回所有交易员的姓名字符串，按字母顺序排序。
     */
    @Test
    public void test4() {
        String tradeStr = transactions.stream()
                //提取所有交易员姓名,生成一个Strings构成的Stream
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                //对姓名按字母顺序排序
                .sorted()
                //逐个拼接每个名字,得到一个将所有名字连接起来的String
                .reduce("", (n1, n2) -> n1 + "" + n2);

        System.out.println(tradeStr);
    }

    /**
     * 5.返回所有交易员的姓名字符串，按字母顺序排序。
     */
    @Test
    public void test5() {
        String tradeStr = transactions.stream()
                //提取所有交易员姓名,生成一个Strings构成的Stream
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                //对姓名按字母顺序排序
                .sorted()
                //逐个拼接每个名字,得到一个将所有名字连接起来的String
                .collect(Collectors.joining());

        System.out.println(tradeStr);
    }


    /**
     * 6.有没有交易员是在米兰工作的
     */
    public void test6(){
        boolean milanBased = transactions.stream()
                //把一个谓词传递给anyMatch ,检查是否有交易员在米兰工作
                .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));
    }

    /**
     * 7.打印生活在剑桥的交易员的所有交易额
     */
    @Test
    public void test7(){

        transactions.stream()
                // 选择住在剑桥的交易员所进行的交易
                .filter(t->"Cambridge".equals(t.getTrader().getCity()))
                // 提取这些交易的交易额
                .map(Transaction::getValue)
                // 打印每个值
                .forEach(System.out::println);


    }

    /**
     * 8所有交易中，最高的交易额是多少？
     */
    @Test
    public void test8(){
        transactions.stream()
                // 提取每项交易的交易额
                .map(Transaction::getValue)
                // 计算生成的流中的最大值
                .reduce(Integer::max);
    }


    /**
     * 9.找到交易额最小的交易。
     *
     */

    public void test9(){
        Optional<Transaction> min = transactions
                .stream()
                //// 通过反复比较每个交易的交易额，找出最小的交易
                .min(Comparator.comparing(Transaction::getValue));
    }


    //##############原始类型流特化#############


    @Test
    public void test10(){

    }


}
