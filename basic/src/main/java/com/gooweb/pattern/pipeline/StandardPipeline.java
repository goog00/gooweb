package com.gooweb.pattern.pipeline;

/**
 * 管道
 *
 * @author sunteng
 * @date 2019-11-26 下午 11:03
 **/
public class StandardPipeline implements Pipeline {

    protected Valve first;
    protected Valve basic;

    @Override
    public Valve getFirst() {
        return first;
    }

    @Override
    public Valve getBasic() {
        return basic;
    }

    @Override
    public void setBasic(Valve valve) {
         basic = valve;
    }

    @Override
    public void addValve(Valve valve) {
        if(first == null){
            first = valve;
            valve.setNext(basic);
        }
        else {
            Valve current = first;
            while(current != null){
                //设置基础阀为最后一个执行的阀
                if(current.getNext() == basic){
                    current.setNext(valve);
                    valve.setNext(basic);
                    break;
                }
                current = current.getNext();
            }
        }
    }
}
