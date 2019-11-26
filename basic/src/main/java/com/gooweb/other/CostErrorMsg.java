package com.gooweb.other;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * @author sunteng
 * @create 2019-10-14 下午 3:29
 **/
public class CostErrorMsg {

    public static final String COST_LACK_MSG_PREFIX = "成本可用量不足!";

    public static final String GOODS_CODE = "GoodsCode";

    public static final String COST_LACK_MSG = COST_LACK_MSG_PREFIX + "相差数量为Quantity={},商品编码" + GOODS_CODE + "=[{}],批号LotNum={}";

    public static String getFormatMsg(String format,Object... arguments){
        FormattingTuple formattingTuple = MessageFormatter.arrayFormat(format, arguments);
        String formatMsg = formattingTuple.getMessage();
        return formatMsg;
    }


    public static void main(String[] args) {
        String formatMsg = CostErrorMsg.getFormatMsg(CostErrorMsg.COST_LACK_MSG, 1, 33, 5);
        System.out.println(formatMsg);
        String goodsCode = formatMsg.substring(formatMsg.lastIndexOf('[') + 1, formatMsg.lastIndexOf(']'));
        System.out.println(goodsCode);
    }
}
